package com.Charter.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="rewards")
public class Rewards {
    @Id
    @Column(name="username")
    private String username;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="password")
    private String password;
    @Column(name="points")
    private Integer points;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="transaction_id")
    private List<Transaction> transactionList;

    public Rewards() {}

    public Rewards(String username, String firstName, String lastName, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.points = 0;
        this.transactionList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getPoints() {
        return points;
    }
    public void setPoints(Integer points) {
        this.points = points;
    }
    public List<Transaction> getTransactionList() {
        return transactionList;
    }
    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }
    public String pointsToString(){
        return "User " + firstName
                + " " + lastName
                + " has a total of " + points;
    }
}