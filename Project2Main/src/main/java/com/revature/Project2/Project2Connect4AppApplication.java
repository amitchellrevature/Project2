package com.revature.Project2;

import com.revature.Project2.entity.Users;
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

@Override
public void run (String... args) throws Exception{
	this.usersRepository.save(new Users(1,"pahn", "test","philip", "ahn"));
	this.usersRepository.save(new Users(2,"pahn2", "test2","philip2", "ahn2"));

}
}
