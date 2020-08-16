package com.interview.pbasu.seed;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.interview.pbasu.domain.Product;
import com.interview.pbasu.repositories.ProductRepository;

@Component
public class SeedDataLoader {

	@Autowired
	ProductRepository productRepository;
	
	private List<Product> seedProductList;

	@PostConstruct
	public void loadData()
	{
		productRepository.saveAll(getSeedData());
	}
	
	private List<Product> getSeedData()
	{
		Calendar cal = Calendar.getInstance();
		seedProductList = new ArrayList<>();
		seedProductList.add(new Product(UUID.randomUUID(), "ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", 23.49f, "RED", "L", "BizTraders", cal.getTime(), false, "available"));
		seedProductList.add(new Product(UUID.randomUUID(), "ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", 23.49f, "RED", "L", "BizTraders", cal.getTime(), true, "sold"));
		seedProductList.add(new Product(UUID.randomUUID(), "ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", 23.49f, "RED", "L", "BizTraders", cal.getTime(), false, "available"));
		seedProductList.add(new Product(UUID.randomUUID(), "ADREDSHTM123", "Red Checked Shirt", "Shirt", "Adidas", 23.49f, "RED", "L", "BizTraders", cal.getTime(), false, "available"));
		seedProductList.add(new Product(UUID.randomUUID(), "ADREDSHTM456", "Red Checked Shirt", "Shirt", "Adidas", 23.49f, "RED", "L", "BizTraders", cal.getTime(), false, "available"));
//		seedProductList.add();
//		seedProductList.add();
		return seedProductList;
	}
}
