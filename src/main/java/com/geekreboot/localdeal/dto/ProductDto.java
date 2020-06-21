package com.geekreboot.localdeal.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
	private long id;
	private String code;
	private String name;
	private String desc;
	private String groceryType;
	private String imageUrl;

	public ProductDto(String code, String name, String groceryType, String imageUrl) {
		super();
		this.code = code;
		this.name = name;
		this.desc = name;
		this.groceryType = groceryType;
		this.imageUrl = imageUrl;
	}

}
