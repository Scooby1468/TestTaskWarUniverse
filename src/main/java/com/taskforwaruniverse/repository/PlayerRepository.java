package com.taskforwaruniverse.repository;

import com.taskforwaruniverse.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
