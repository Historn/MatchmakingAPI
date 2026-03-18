package com.matchmaking.service;

import com.matchmaking.model.Player;
import com.matchmaking.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Business logic layer
// Player Queue handling
@Service
public class MatchmakingService {

    @Autowired
    private PlayerRepository repository;

    public Player addPlayer(String username, int skill){
        Player player = new Player(username, skill);
        return repository.save(player);
    }

    public List<Player> getQueue() {
        return repository.findAll();
    }
}
