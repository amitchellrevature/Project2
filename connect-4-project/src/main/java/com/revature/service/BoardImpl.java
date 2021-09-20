package com.revature.service;

import com.revature.entity.Board;
import com.revature.entity.BoardArchive;
import com.revature.entity.Team;
import com.revature.repository.BoardArchiveRepository;
import com.revature.repository.BoardRepository;
import com.revature.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.Optional;

@Service
public class BoardImpl implements  BoardService {

    @Autowired
    private BoardRepository repository;

    @Autowired
    private BoardArchiveRepository archiveRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Board saveBoard(Board board) {
        return repository.save(board);
    }

    @Override
    public Board getBoardById(long id) {
        Optional<Board> board =  repository.findById(id);
        return board.get();
    }

    @Override
    public Board getNewBoard(){
        List<Board> boards = repository.findAll();
        //boards.removeIf(board -> board.getTeam1() != team);
        Random rand = new Random();
        int index = rand.nextInt(5);
        if (index < boards.size()){
            return boards.get(index);
        } else {
            Board board = new Board();
            //board.setTeam1(team);
            List<Team> teams = teamRepository.findAll();
            index = rand.nextInt(teams.size()) + 1;
            board.setTeam1(teamRepository.getById((long) index));
            do {
                index = rand.nextInt(teams.size()) + 1;
                //} while ( team.getId() == (long) index );
            } while ( board.getTeam1().getId() == (long) index );
            board.setTeam2(teamRepository.getById((long) index));
            System.out.println(index);
            board.setConfiguration(
                    "NNNNNNNNN" +
                    "NOOOOOOON" +
                    "NOOOOOOON" +
                    "NOOOOOOON" +
                    "NOOOOOOON" +
                    "NOOOOOOON" +
                    "NOOOOOOON" +
                    "NNNNNNNNN");
            repository.save(board);
            return board;
        }
    }

    @Override
    public List<Board> getAllBoards() {
        return repository.findAll();
    }

    @Override
    public List<Board> getBoardsByColor(long team_id) {
        List<Board> boards = repository.findAll();
        int i = 0;
        for (Board board: boards) {
            if (!board.getTeam1().getId().equals(team_id)) {
                boards.remove(i);
                i--;
            }
            i++;
        }
        return boards;
    }

    @Override
    public Board updateBoard(Board board, int slot) {

        //Board board = repository.getById(id);
        long id = board.getId();
        board.setConfiguration(Connect4Logic.place(board.getConfiguration(), slot, board.getTeam1().getCharacters()));
        if (Connect4Logic.winCheck(board.getConfiguration(), slot)){
            BoardArchive boardArchive = new BoardArchive();
            boardArchive.setConfiguration(board.getConfiguration());
            boardArchive.setWinner(board.getTeam1());
            archiveRepository.save(boardArchive);
            board.getTeam1().setWins(board.getTeam1().getWins() + 1) ;
            teamRepository.save(board.getTeam1());
            board.getTeam2().setLosses(board.getTeam2().getLosses() + 1) ;
            teamRepository.save(board.getTeam2());
            repository.deleteById(id);
            return null;
        }
        Team team = board.getTeam1();
        board.setTeam1(board.getTeam2());
        board.setTeam2(team);
        repository.save(board);
        return board;
    }
}
