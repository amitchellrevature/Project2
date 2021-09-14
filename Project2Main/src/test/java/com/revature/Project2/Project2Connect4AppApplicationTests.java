package com.revature.Project2;

import com.revature.Project2.entity.Teams;
import com.revature.Project2.entity.Users;
import com.revature.Project2.repository.TeamsRepository;
import com.revature.Project2.repository.UsersRepository;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Project2Connect4AppApplicationTests {

@Autowired
	private UsersRepository usersRepository;
@Autowired
	private TeamsRepository teamsRepository;

@Test
	public void saveUser(){
	Users user = Users.builder()

			.username("test")
			.password("test")
			.firstName("Phil")
			.lastName("Ahn")
			.build();
		usersRepository.save(user);
}

@Test
	public void saveUserWithTeams(){
	Teams team= Teams.builder()
			.teamColor("red")
			.wins(1)
			.losses(2)
			.build();

	Users user = Users.builder()

			.username("some user")
			.password("admin")
			.firstName("test")
			.lastName("test1")
			.build();
	usersRepository.save(user);
	teamsRepository.save(team);
}

}
