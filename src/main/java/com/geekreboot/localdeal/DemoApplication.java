package com.geekreboot.localdeal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.geekreboot.localdeal.jpa.UserRepository;
import com.geekreboot.localdeal.service.ProductService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	@Autowired
	private Environment environment;

	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Pbkdf2PasswordEncoder encoder = new
		 * Pbkdf2PasswordEncoder(environment.getProperty("password.encoder.key")); Users
		 * user = new Users("krishna", encoder.encode("krishna"), "DEALER");
		 * repository.save(user); Users user1 = new Users("shiva",
		 * encoder.encode("shiva"), "USER"); repository.save(user1);
		 */
		/*ProductDto productDto = new ProductDto("MANGO", "Kesar Mango", GroceryTypeEnum.FRUITS,
				"https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/62e4b3b9-3a82-47c9-be50-e6d095c1f648_425x425.jpg");
		productService.save(productDto);
		productDto = new ProductDto("AVOCADO", "Avocado", GroceryTypeEnum.FRUITS,
				"https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/a473f647-d419-42d6-bceb-6859d017acbe_425x425.jpg");
		productService.save(productDto);
		productDto = new ProductDto("GRAPES", "Grapes Red", GroceryTypeEnum.FRUITS,
				"https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/f341c972-bc85-4b0d-8309-6bdaa4fd0cad_425x425.JPG");
		productService.save(productDto);
		productDto = new ProductDto("BANANA", "Banana Golden",GroceryTypeEnum.FRUITS,
				"https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/de0cd3e5-eefd-4b56-9ec1-503a5db10333_425x425.JPG");
		productService.save(productDto);
		productDto = new ProductDto("BLUEBERRY", "BlueBerry - exotic",GroceryTypeEnum.FRUITS,
				"https://d1z88p83zuviay.cloudfront.net/ProductVariantThumbnailImages/83e591f2-ace2-4b45-8916-9a532bfea930_425x425.jpg");
		productService.save(productDto);*/

	}
}
