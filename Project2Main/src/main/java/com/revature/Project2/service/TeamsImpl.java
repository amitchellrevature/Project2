package com.revature.Project2.service;

import com.revature.Project2.entity.Teams;
import com.revature.Project2.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamsImpl implements  TeamsService{

    @Autowired
    private TeamsRepository repository;

    @Override
    public Teams saveTeam(Teams teams) {
        return repository.save(teams);
    }

    @Override
    public Teams showWins(Teams wins) {
        return null;
    }

    @Override
    public Teams showLosses(Teams losses) {
        return null;
    }

    @Override
    public List<Teams> getAllTeams() {
        return null;
    }
}
