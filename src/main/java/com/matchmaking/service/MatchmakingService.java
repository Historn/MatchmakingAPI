package com.matchmaking.service;

import com.matchmaking.model.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Business logic layer
// Player Queue handling

@Service
public class MatchmakingService {

    private List<Player> queue = new ArrayList<>(); // Temporary data saving, data doesnt persist if app closes

    public Player addPlayer(String username, int skill){
        Player player = new Player(username, skill);
        queue.add(player);
        return player;
    }

    public List<Player> getQueue() {
        return queue;
    }
}
