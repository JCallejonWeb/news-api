package com.Juan.newsapp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fuente {

	@Schema(name="id", description="source id")
	private String id;
	@Schema(name="name", description="source name")
	private String name;

}
