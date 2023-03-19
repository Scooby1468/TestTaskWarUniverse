package com.taskforwaruniverse.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "last_authorization")
    private LocalDateTime timeLastAuthorization;
    @Column(name = "date_registration")
    private LocalDateTime dateRegistration;

    public Player() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getTimeLastAuthorization() {
        return timeLastAuthorization;
    }

    public void setTimeLastAuthorization(LocalDateTime timeLastAuthorization) {
        this.timeLastAuthorization = timeLastAuthorization;
    }

    public LocalDateTime getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(LocalDateTime dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Player(long id, String login, String password, LocalDateTime timeLastAuthorization, LocalDateTime dateRegistration) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.timeLastAuthorization = timeLastAuthorization;
        this.dateRegistration = dateRegistration;
    }
}
