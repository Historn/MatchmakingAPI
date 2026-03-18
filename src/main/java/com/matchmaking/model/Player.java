package com.matchmaking.model;

import jakarta.persistence.*;

@Entity // Set class to map to a database table
public class Player {

    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increments the ID
    private Long id;

    private String username;
    private int skill;

    public Player() {}

    public Player (String username, int skill){
        this.username = username;
        this.skill = skill;
    }

    public Long getId() { return id; }

    public String getUsername(){
        return username;
    }

    public int getSkill(){
        return skill;
    }
}
