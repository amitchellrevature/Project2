package com.revature.service;

import com.revature.entity.Board;
import com.revature.entity.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {
    Board saveBoard(Board board);
    Board getBoardById(long id);
    Board getNewBoard();
    List<Board> getAllBoards();
    List<Board> getBoardsByColor(long team_id);
    Board updateBoard(Board board, int slot);
}
