package com.interview.pbasu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.interview.pbasu.domain.Product;
import com.interview.pbasu.repositories.ProductRepository;

@Component
public class ECommDataStoreApplicationStartupRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
/*
 * All Below contents can also be kept in ECommDataStoreApplication inside return of "CommandLineRunner productDemo" bean
		Calendar cal = Calendar.getInstance();
	    Date date=cal.getTime();
	    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    
		 create products
		Product newProduct = new Product(UUID.randomUUID(),"ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", "23.49", "RED", "L", "BizTraders", cal.getTime(), false);
		newProduct = productRepository.save(newProduct);
		System.out.println("ID for Book is " + newProduct.getId() + "  Serial for Product is " + newProduct.getProductSerial());
		System.out.println();
		
		newProduct = new Product(UUID.randomUUID(), "ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", "23.49", "RED", "L", "BizTraders", cal.getTime(), true);
		newProduct = productRepository.save(newProduct);
		System.out.println("ID for Book is " + newProduct.getId() + "  Serial for Product is " + newProduct.getProductSerial());
		System.out.println();
		
		newProduct = new Product(UUID.randomUUID(), "ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", "23.49", "RED", "L", "BizTraders", cal.getTime(), false);
		newProduct = productRepository.save(newProduct);
		System.out.println("ID for Book is " + newProduct.getId() + "  Serial for Product is " + newProduct.getProductSerial());
		System.out.println();
		
		newProduct = new Product(UUID.randomUUID(), "ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", "23.49", "RED", "L", "BizTraders", cal.getTime(), false);
		newProduct = productRepository.save(newProduct);
		System.out.println("ID for Book is " + newProduct.getId() + "  Serial for Product is " + newProduct.getProductSerial());
		System.out.println();
		
		newProduct = new Product(UUID.randomUUID(), "ADREDSHTM456", "Red Checked Shirt", "Shirt", "Adidas", "23.49", "RED", "L", "BizTraders", cal.getTime(), false);
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

		 fetch product by id
		Product product = productRepository.findById(1L).get();
		System.out.println("product found with findById(1L):");
		System.out.println("-----------------------------");
		System.out.println(product.toString());
		System.out.println();

		 fetch product by ISBN
		Product productWithIBSN = productRepository.findByProductSerial("123");
		System.out.println("product found with findByProductSerial('123'):");
		System.out.println("------------------------------------------");
		System.out.println(productWithIBSN.toString());
		System.out.println();

		 fetch all products that contain keyword `java`
		System.out.println("products with findByProductSKU 'ADREDSHTM123' : ");
		System.out.println("----------------------------------");
		for (Product productTemp : productRepository.findByProductSKU("ADREDSHTM123")) {
			System.out.println(productTemp.toString());
		}
		System.out.println();

		 fetch all products that contain keyword `java`
		System.out.println("products with name that contain keyword 'Checked':");
		System.out.println("----------------------------------");
		for (Product productTemp : productRepository.findByProductNameContaining("Checked")) {
			System.out.println(productTemp.toString());
		}
		System.out.println();
		
		fetch all products that contain keyword `java`
		System.out.println("products with name that contain keyword 'Checked':");
		System.out.println("----------------------------------");
		for (Product productTemp : productRepository.findBylastUpdatedBefore(cal.getTime())) {
			System.out.println(productTemp.toString());
		}
		System.out.println();
		
		fetch all products that contain keyword `java`
		System.out.println("products with name that contain keyword 'Checked':");
		System.out.println("----------------------------------");
		for (Product productTemp : productRepository.findByLastUpdatedInCacheStatus(false)) {
			System.out.println(productTemp.toString());
		}
		System.out.println();
		
		fetch all products that contain keyword `java`
		System.out.println("products with name that contain keyword 'Checked':");
		System.out.println("----------------------------------");
		for (Product productTemp : productRepository.findByLastUpdatedInCacheStatusOrderByLastUpdatedAsc(false)) {
			System.out.println(productTemp.toString());
		}
		System.out.println();

		update product title
		Product productUpdate = productRepository.findById(1L).get();
		productUpdate.setProductName("Java Gently 2nd Edition");
		productRepository.save(productUpdate);
		System.out.println("Update product title:");
		System.out.println("------------------");
		System.out.println(productUpdate.toString());
		System.out.println();

		total products in DB
		System.out.println("Total products in DB:");
		System.out.println("------------------");
		System.out.println(productRepository.count());
		System.out.println();
		
		total products in DB
		System.out.println("Total products in DB by SKU 'ADREDSHTM123':");
		System.out.println("------------------");
		System.out.println(productRepository.countByproductSKU("ADREDSHTM123"));
		System.out.println();

		delete all products
		productRepository.deleteAll();
*/		
	}

}
