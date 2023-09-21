package com.Juan.newsapp.entity;

import java.sql.Timestamp;

import io.swagger.v3.oas.annotations.media.Schema;
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
	@Schema(name="id", description="id de la noticia")
	private Long id;
	
	@Column(name = "title")
	@Schema(name="titulo", description="titulo de la noticia")
	private String titulo;

	@Column(name = "description")
	@Schema(name="descripcion", description="descripcion de la noticia")
	private String descripcion;
	
	@Column(name = "source")
	@Schema(name="fuente", description="fuente de la noticia")
	private String fuente;
	
	@Column(name = "url")
	@Schema(name="url", description="url de la noticia")
	private String url;
	
	@Column(name = "urlimage")
	@Schema(name="urlimage", description="urlimage de la noticia")
	private String urlImage;
	
	@Column(name = "published_at")
	@Schema(name="fecha de publicacion", description="fecha de publicacion")
	private Timestamp fechaPublicacion;
	
}
