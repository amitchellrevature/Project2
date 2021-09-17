package com.revature.Project2.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Id of board, Id of team winner, Config
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardArchive {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long winner;

    private Long loser;

    private Long turnCount;

    private String boardConfig;


}
