package com.game.apiGame.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.game.apiGame.models.Game;
import com.game.apiGame.repository.GameRepository;

@RestController
@RequestMapping("/game")
public class GameResource {
	
	@Autowired
	private GameRepository gr;
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Game> listaGame() {
		Iterable<Game> listaGame = gr.findAll();
		return listaGame;
	}
	
	@PostMapping()
	public Game cadastraUsuario(@RequestBody @Valid Game game) {
		return gr.save(game);
	}
	
	@DeleteMapping()
	public Game deletaUsuario (@RequestBody Game game) {
		gr.delete(game);
		return game;
	}
	
}
