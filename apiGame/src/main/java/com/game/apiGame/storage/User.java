package com.game.apiGame.storage;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class User {

	@Value("${gamedev.user.local}")
	private String local;
	
	@Value("${gamedev.user.local-usuarios}")
	private String LocalUsuarios;
	
	public void saveUser(MultipartFile user) {
		this.salvar(this.LocalUsuarios, user);
}
	public void salvar(String diretorio, MultipartFile arquivo) {
		Path diretorioPath = Paths.get(this.local, diretorio);
		Path arquivoPath = diretorioPath.resolve(arquivo.getOriginalFilename());
		
		try {
			Files.createDirectories(diretorioPath);
			arquivo.transferTo(arquivoPath.toFile());
		}catch(IOException e){
			throw new RuntimeException("Problemas na tentativa de salvar arquivo.", e);
		}
	}
}
