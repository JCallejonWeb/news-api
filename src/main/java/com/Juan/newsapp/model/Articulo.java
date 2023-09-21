package com.Juan.newsapp.model;

import java.sql.Timestamp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articulo {

	private Fuente source;
	@Schema(name="author", description="name of the author")
    private String author;
	@Schema(name="title", description="title of the article")
    private String title;
	@Schema(name="description", description="description of the article")
    private String description;
	@Schema(name="url", description="notice url")
    private String url;
	@Schema(name="urlToImage", description="notice image")
    private String urlToImage;
	@Schema(name="publishedAt", description="publication date")
    private Timestamp publishedAt;
	@Schema(name="content", description="notice content")
    private String content;
	
}
