package com.Juan.newsapp.service.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.Juan.newsapp.entity.Noticias;
import com.Juan.newsapp.model.NoticiasApiResponse;
import com.Juan.newsapp.repository.NoticiasRepository;
import com.Juan.newsapp.service.NoticiasService;

@Service
@Transactional
public class NoticiasServiceImpl implements NoticiasService {

	private final RestTemplate restTemplate;
	
	@Autowired
	private NoticiasRepository noticiasRepository;
	
	 @Autowired
	    public NoticiasServiceImpl(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }
	
	@Override
	public NoticiasApiResponse getDatosDeAPI() {
		 String apiUrl = "https://newsapi.org/v2/everything?q=keyword&apiKey=65576e47e9f844f784e1238c5a70ad13";
		 NoticiasApiResponse noticias = restTemplate.getForObject(apiUrl, NoticiasApiResponse.class);
		 return noticias;
	}
		 
	
	@Override
	public Noticias saveNoticias(NoticiasApiResponse noticiaApi) {
		
		Random random = new Random();
        int randomNum = random.nextInt(100);
		
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
		Noticias noticia = new Noticias(null, noticiaApi.getArticles().get(randomNum).getTitle(), noticiaApi.getArticles().get(randomNum).getDescription(),
				noticiaApi.getArticles().get(randomNum).getSource().getName(),noticiaApi.getArticles().get(randomNum).getUrl(),
				noticiaApi.getArticles().get(randomNum).getUrlToImage(), timestamp);
		
		return noticiasRepository.save(noticia);
		
	}

	@Override
	public List<Noticias> getNoticias() {
		return noticiasRepository.findTop6ByOrderByFechaPublicacionDesc();
	}
	
}
