package com.revature.service;

import com.revature.entity.Team;
import com.revature.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamImpl implements TeamService {

    @Autowired
    private TeamRepository repository;

    @Override
    public Team saveTeam(Team team) {
        return repository.save(team);
    }

    @Override
    public List<Team> getAllTeams() {
        return repository.findAll();
    }

    @Override
    public Team getTeamById(long id) {
        Optional<Team> team =  repository.findById(id);
        return team.get();
    }
}
