package com.revature.Project2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Boards {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long team1;

    private Long team2;

    private Long turnCount;

    private String boardConfig;



}
