package com.interview.pbasu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.interview.pbasu.domain.Product;
import com.interview.pbasu.repositories.ProductRepository;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class ECommDataStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommDataStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner productDemo(ProductRepository productRepository) {
		return (args) -> {
/*
			All content from ECommDataStoreApplicationStartupRunner.run can also be executed here
		    Calendar cal = Calendar.getInstance();
		    Date date=cal.getTime();
		    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		    
			System.out.println();

			create products
			Product newProduct = new Product(UUID.randomUUID(),"ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", "23.49", "RED", "L", "BizTraders", cal.getTime(), false);
			newProduct = productRepository.save(newProduct);
			System.out.println("ID for Book is " + newProduct.getId() + "  Serial for Product is " + newProduct.getProductSerial());
			System.out.println();

	        System.out.println("Enter word!");
	        Scanner scanner = new Scanner(System.in);
	        String line = scanner.nextLine();
	        System.out.println(line);
	        
			fetch all products
			System.out.println("products found with findAll():");
			System.out.println("---------------------------");
			for (Product productTemp : productRepository.findAll()) {
				System.out.println(productTemp.toString());
			}
			System.out.println();
*/
		};
	}
}
