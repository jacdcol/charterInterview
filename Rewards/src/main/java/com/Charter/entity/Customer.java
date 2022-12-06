package com.Charter.entity;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="username")
    private Rewards rewards;
    public Customer() {}
    public Customer(String name, Rewards rewards) {
        this.name = name;
        this.rewards = rewards;
    }
}
