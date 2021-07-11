package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;

@SpringBootApplication
public class EcommerceApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		productRepository.insert(new Product(1,"Nike Air", "8990", "Sport Shoes"));
		productRepository.insert(new Product(2, "HRX", "2999", "Sport Shoes"));
		productRepository.insert(new Product(3, "Bata", "1850", "Casual Shoes"));
		productRepository.insert(new Product(4, "Sniker", "1100", "Formal Shoes"));
		productRepository.insert(new Product(5, "Adidas", "5400", "Casual Shoes"));
	
	}
	
	

}
