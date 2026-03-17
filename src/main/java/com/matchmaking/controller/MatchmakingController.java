package com.matchmaking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Marks class as API controller Client → HTTP Request → Controller → Response → Client
public class MatchmakingController {

    @GetMapping("/hello")
    public String hello(){
        return "Matchmaking API is running!";
    }
}
