package com.matchmaking.dto;

// DTO = Data Transfer Object
// Receives data from client
// Avoids exposing internal models

public class PlayerRequest {

    // Player variables to add it to the match
    private String username;
    private int skill;

    // Getters and Setters
    public String getUsername(){
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSkill(){
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }
}
