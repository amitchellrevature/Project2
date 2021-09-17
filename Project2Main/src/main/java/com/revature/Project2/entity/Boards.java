package com.revature.Project2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;

import javax.persistence.*;


@Entity
@AllArgsConstructor

@Builder
public class Boards {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "team1")
    private int team1;

    @Column (name = "team2")
    private int team2;

    @Column (name = "turn_count")
    private Long turnCount;

    @Column (name = "board_config")
    private String boardConfig;

    public Boards(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTeam1() {
        return team1;
    }

    public void setTeam1(int team1) {
        this.team1 = team1;
    }

    public int getTeam2() {
        return team2;
    }

    public void setTeam2(int team2) {
        this.team2 = team2;
    }

    public Long getTurnCount() {
        return turnCount;
    }

    public void setTurnCount(Long turnCount) {
        this.turnCount = turnCount;
    }

    public String getBoardConfig() {
        return boardConfig;
    }

    public void setBoardConfig(String boardConfig) {
        this.boardConfig = boardConfig;
    }
}
