package com.matchmaking.model;

public class Player {
    private String username;
    private int skill;

    public Player (String username, int skill){
        this.username = username;
        this.skill = skill;
    }

    public String getUsername(){
        return username;
    }

    public int getSkill(){
        return skill;
    }
}
