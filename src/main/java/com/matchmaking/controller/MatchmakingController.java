package com.matchmaking.controller;

import com.matchmaking.dto.PlayerRequest;
import com.matchmaking.model.Player;
import com.matchmaking.service.MatchmakingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Marks class as API controller Client → HTTP Request → Controller → Response → Client
@RequestMapping("/matchmaking")
public class MatchmakingController {

    @Autowired
    private MatchmakingService service;

    @GetMapping("/hello")
    public String hello(){
        return "Matchmaking API is running!";
    }

    @PostMapping("/join")
    public Player joinMatch(@RequestBody PlayerRequest request){ // RequestBody converts JSON object to Java Object automatically
        return service.addPlayer(request.getUsername(), request.getSkill());
    }

    @GetMapping("/queue")
    public List<Player> getQueue(){
        return service.getQueue();
    }
}
