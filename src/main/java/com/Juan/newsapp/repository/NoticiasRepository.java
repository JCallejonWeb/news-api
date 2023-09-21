package com.Juan.newsapp.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Juan.newsapp.entity.Noticias;

public interface NoticiasRepository extends CrudRepository<Noticias, Long>{

	List<Noticias> findTop6ByOrderByFechaPublicacionDesc();
	
}
