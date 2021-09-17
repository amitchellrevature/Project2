package com.revature.Project2;

import com.revature.Project2.entity.BoardArchive;
import com.revature.Project2.entity.Boards;
import com.revature.Project2.entity.Teams;
import com.revature.Project2.entity.Users;
import com.revature.Project2.repository.BoardArchiveRepository;
import com.revature.Project2.repository.BoardsRepository;
import com.revature.Project2.repository.TeamsRepository;
import com.revature.Project2.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project2Connect4AppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Project2Connect4AppApplication.class, args);
	}



@Autowired
private UsersRepository usersRepository;

	@Autowired
	private BoardsRepository boardsRepository;

	@Autowired
	private TeamsRepository teamsRepository;

	@Autowired
	private BoardArchiveRepository boardArchiveRepository;

//@Override
//public void run (String... args) throws Exception{
//	this.usersRepository.save(new Users(1,"pahn", "test","philip", "ahn"));
//	this.usersRepository.save(new Users(2,"pahn2", "test2","philip2", "ahn2"));
//
//}

//@Override
//	public void run(String... args) throws Exception{
//	this.boardsRepository.save(new Boards(1L,1,2,1L,"test"));
//	this.boardsRepository.save(new Boards(2L,1,2,1L,"test2"));
//}

//	@Override
//	public void run(String... args) throws Exception{
//		this.teamsRepository.save(new Teams(1,"test",2,2));
//		this.teamsRepository.save(new Teams(2,"test2",3,3));
//
//	}

	@Override
	public void run(String... args) throws Exception{
		this.boardArchiveRepository.save(new BoardArchive(1L, 2L,3L,2L,"test"));
		this.boardArchiveRepository.save(new BoardArchive(2L, 10L,13L,3L,"test"));


	}
}
