package com.revature.Project2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//Teams
//        ------
//        (teamID)  int, auto_increment
//        teamColor varchar(255)
//        wins
//        losses



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teams {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teamId;

    @Column(name = "color", nullable = false)
    private String teamColor; //Red, Yellow // Blue, Green
    private int wins;
    private int losses;



}
