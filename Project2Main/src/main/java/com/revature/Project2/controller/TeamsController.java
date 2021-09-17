package com.revature.Project2.controller;


import com.revature.Project2.entity.Teams;
import com.revature.Project2.entity.Users;
import com.revature.Project2.repository.TeamsRepository;
import com.revature.Project2.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/")
public class TeamsController {

    @Autowired
    private TeamsRepository teamsRepository;


    @GetMapping("teams")
    public List<Teams> getTeams() {
        return this.teamsRepository.findAll();
    }


}