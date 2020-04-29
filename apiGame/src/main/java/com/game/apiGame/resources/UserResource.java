package com.game.apiGame.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.game.apiGame.storage.User;

@RestController
@RequestMapping("/foto")
@CrossOrigin("*")
public class UserResource {
	
	@Autowired
	private User disco;
	
	@PostMapping
	public void upload(@RequestParam MultipartFile foto) {
		disco.saveUser(foto);
	}

}
