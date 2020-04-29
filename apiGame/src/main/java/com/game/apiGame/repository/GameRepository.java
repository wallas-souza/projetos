package com.game.apiGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.apiGame.models.Game;

public interface GameRepository extends JpaRepository <Game, String>{

}
