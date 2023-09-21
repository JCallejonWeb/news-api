package com.Juan.newsapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Juan.newsapp.entity.Noticias;
import com.Juan.newsapp.model.NoticiasApiResponse;

@Service
public interface NoticiasService {
	
	NoticiasApiResponse getDatosDeAPI();
	
	Noticias saveNoticias(NoticiasApiResponse noticiaApi);
	
	List<Noticias> getNoticias();
	
}
