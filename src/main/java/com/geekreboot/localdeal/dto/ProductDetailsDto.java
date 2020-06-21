package com.geekreboot.localdeal.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDetailsDto {

	private List<ProductDto> list = new ArrayList<>();
	private String type;
}
