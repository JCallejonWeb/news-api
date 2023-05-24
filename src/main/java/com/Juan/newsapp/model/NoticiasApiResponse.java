package com.Juan.newsapp.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticiasApiResponse {

	private String status;
	private int totalResults;
	private List<Articulo> articles;

}
