package com.Juan.newsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Juan.newsapp.entity.Noticias;
import com.Juan.newsapp.model.NoticiasApiResponse;
import com.Juan.newsapp.service.NoticiasService;

@RestController
@RequestMapping("/api")
public class NoticiasController {

	@Autowired
	private NoticiasService noticiaService;
	
	@GetMapping("/get-noticia")
	public NoticiasApiResponse getNoticia(){
		
		return noticiaService.getDatosDeAPI();
	}
	
	@GetMapping("/save-noticia-aleatoria")
	public Noticias saveNoticias(){
		
		NoticiasApiResponse noticasApi = noticiaService.getDatosDeAPI();

		return noticiaService.saveNoticias(noticasApi);
	}
	
	@GetMapping("/show-noticias")
	public List<Noticias> getNoticias(){
		
		return noticiaService.getNoticias();
	}
}
