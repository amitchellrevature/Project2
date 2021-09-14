package com.revature.Project2.controller;


import com.revature.Project2.entity.Teams;
import com.revature.Project2.service.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamsController {

    @Autowired
private TeamsService service;


@PostMapping("/teams")
    public Teams saveTeam(@RequestBody Teams teams){
    return service.saveTeam(teams);
}
}
