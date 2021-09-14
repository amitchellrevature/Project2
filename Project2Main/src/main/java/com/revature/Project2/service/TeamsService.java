package com.revature.Project2.service;


import com.revature.Project2.entity.Teams;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeamsService {
    Teams saveTeam(Teams teams);
    Teams showWins(Teams wins);
    Teams showLosses(Teams losses);
    List<Teams> getAllTeams();

}
