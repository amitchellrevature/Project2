package com.revature;

import com.revature.entity.Team;
import com.revature.repository.TeamRepository;
import com.revature.entity.User;
import com.revature.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Connect4ApplicationTests {

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveRed() {
        Team team = Team.builder()
                .color("red")
                .characters('R')
                .wins(0L)
                .losses(0L)
                .build();
        teamRepository.save(team);
    }

    @Test
    public void saveYellow() {
        Team team = Team.builder()
                .color("yellow")
                .characters('Y')
                .wins(0L)
                .losses(0L)
                .build();
        teamRepository.save(team);
    }

    @Test
    public void addUser() {
        Team team = teamRepository.getById(1L);
        User user = User.builder()
                .username("amitchell")
                .password("password")
                .team(team)
                .build();
        userRepository.save(user);
    }
}
