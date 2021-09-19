package com.revature.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="ARCHIVE_SEQ")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardArchive {
    @Id @GeneratedValue(strategy = GenerationType.AUTO, generator="ARCHIVE_SEQ") private Long id;
    private String configuration;
    @ManyToOne private Team winner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }
}
