package com.Charter.entity;

import jakarta.persistence.*;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="email")
    private String email;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="username")
    private Rewards rewards;

    public Customer() {}
    public Customer(String email, String firstName, String lastName, Rewards rewards) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rewards = rewards;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
    public Rewards getRewards() {
        return rewards;
    }
    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }
}
