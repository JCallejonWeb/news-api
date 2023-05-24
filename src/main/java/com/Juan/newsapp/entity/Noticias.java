package com.Juan.newsapp.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "news")
public class Noticias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "title")
	private String titulo;

	@Column(name = "description")
	private String descripcion;
	
	@Column(name = "source")
	private String fuente;
	
	@Column(name = "url")
	private String url;
	
	@Column(name = "urlimage")
	private String urlImage;
	
	@Column(name = "published_at")
	private Timestamp fechaPublicacion;
	
}
