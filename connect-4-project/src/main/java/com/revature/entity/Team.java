package com.revature.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@SequenceGenerator(name="TEAM_SEQ")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="TEAM_SEQ") private Long id;
    private String color;
    private char character;
    private Long wins;
    private Long losses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getCharacter() {
        return this.character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getWins() {
        return wins;
    }

    public void setWins(Long wins) {
        this.wins = wins;
    }

    public Long getLosses() {
        return losses;
    }

    public void setLosses(Long losses) {
        this.losses = losses;
    }
}
