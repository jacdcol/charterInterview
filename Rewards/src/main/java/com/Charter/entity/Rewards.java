package com.Charter.entity;

import jakarta.persistence.*;

@Entity
public class Rewards {
    @Id
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="points")
    private Integer points;

    public Rewards() {}
    public Rewards(String username, String password, Integer points) {
        this.username = username;
        this.password = password;
        this.points = points;
    }
}
