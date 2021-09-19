package com.revature.controller;

import com.revature.entity.Team;
import com.revature.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class TeamController {

    @Autowired
    private TeamService service;

    @PostMapping("/team")
    public Team saveTeam(@RequestBody Team team) {
        return service.saveTeam(team);
    }

    @GetMapping("/team")
    public List<Team> getAllTeams() {
        return service.getAllTeams();
    }

    @GetMapping("/team/{id}")
    public Team getTeamById(@PathVariable("id") long id) {
        return service.getTeamById(id);
    }

}
