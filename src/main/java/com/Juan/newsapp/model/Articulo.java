package com.Juan.newsapp.model;

import java.sql.Timestamp;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Articulo {

	private Fuente source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private Timestamp publishedAt;
    private String content;
	
}
