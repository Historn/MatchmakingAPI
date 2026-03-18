package com.matchmaking.repository;

import com.matchmaking.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

// Database access layer
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
