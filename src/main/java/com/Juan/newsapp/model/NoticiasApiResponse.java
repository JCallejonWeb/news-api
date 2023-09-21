package com.Juan.newsapp.model;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NoticiasApiResponse {

	@Schema(name="estado", type="string")
	private String status;
	@Schema(name="resultados totales", type="int")
	private int totalResults;
	private List<Articulo> articles;

}
