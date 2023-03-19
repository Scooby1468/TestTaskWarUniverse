package com.taskforwaruniverse.repository;

import com.taskforwaruniverse.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
