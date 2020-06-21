package com.geekreboot.localdeal.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.geekreboot.localdeal.dto.ProductDetailsDto;
import com.geekreboot.localdeal.dto.ProductDto;
import com.geekreboot.localdeal.dto.QuotesDto;
import com.geekreboot.localdeal.entity.Products;
import com.geekreboot.localdeal.entity.StoreProducts;
import com.geekreboot.localdeal.entity.Stores;
import com.geekreboot.localdeal.jpa.ProductRepo;
import com.geekreboot.localdeal.jpa.StoresProductsRepo;
import com.geekreboot.localdeal.jpa.StoresRepo;

@Service
public class ProductService {

	@Autowired
	ModelMapper modelMapper;

	@Autowired
	ProductRepo productRepo;

	@Autowired
	StoresRepo storesRepo;

	@Autowired
	StoresProductsRepo storesProductsRepo;

	public List<ProductDetailsDto> getAllProducts() {
		return convertToDto(productRepo.findAll());
	}

	public void save(ProductDto productDto) {
		productRepo.save(convertToEntity(productDto));
	}

	private List<ProductDetailsDto> convertToDto(List<Products> products) {
		List<ProductDetailsDto> lists = new ArrayList<>();
		ProductDetailsDto list = new ProductDetailsDto();
		for (Products product : products) {
			if ("FRUITS".equals(product.getGroceryTypeEnum())) {
				list.setType("Fruits");
				list.getList().add(modelMapper.map(product, ProductDto.class));
			}

		}
		lists.add(list);
		return lists;
	}

	private Products convertToEntity(ProductDto productDto) {
		return modelMapper.map(productDto, Products.class);
	}

	public List<QuotesDto> getQuotes(long productId) {
		List<StoreProducts> list = storesProductsRepo.findStoreProductsByProductId((int) productId);
		List<QuotesDto> quotesDtos = new ArrayList<>();
		for (StoreProducts products : list) {
			QuotesDto dto = new QuotesDto();
			Stores stores = storesRepo.findById(products.getStoreId());
			dto.setShopName(stores.getStoreName());
			dto.setCost(products.getCost());
			quotesDtos.add(dto);
		}

		return quotesDtos;
	}
}
