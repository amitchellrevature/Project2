package com.revature.service;

import com.revature.entity.Team;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamService {
    Team saveTeam(Team team);
    List<Team> getAllTeams();
    Team getTeamById(long id);
}
