package com.taskforwaruniverse.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "game_result")
    private GameResult gameResult;
    private PlayerAndComputerChoice playerAndComputerChoice;

    public Game() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public GameResult getGameResult() {
        return gameResult;
    }

    public void setGameResult(GameResult gameResult) {
        this.gameResult = gameResult;
    }

    public PlayerAndComputerChoice getPlayerAndComputerChoice() {
        return playerAndComputerChoice;
    }

    public void setPlayerAndComputerChoice(PlayerAndComputerChoice playerAndComputerChoice) {
        this.playerAndComputerChoice = playerAndComputerChoice;
    }

    public Game(Long id, GameResult gameResult, PlayerAndComputerChoice playerAndComputerChoice) {
        this.id = id;
        this.gameResult = gameResult;
        this.playerAndComputerChoice = playerAndComputerChoice;
    }
}
