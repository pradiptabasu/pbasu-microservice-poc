package com.interview.pbasu.service;

import java.util.List;
import java.util.UUID;

import com.interview.pbasu.domain.Product;

public interface ProductApiService {

	public Product createProduct(Product product);
	public Product findByProductSerial(UUID productSerial);
	public List<Product> findAllProducts();
	public List<Product> findAllAvailableProducts();
	public List<Product> findByProductSKU(String productSKU);
	public List<Product> findByProductNameContaining(String productName);
	public List<Product> findByProductBrand(String productBrand);
	public List<Product> findByProductColor(String productColor);
	public List<Product> findByProductSize(String productSize);
	public long countByproductSKU(String productSKU);
	public long countByProductSeller(String productSeller);
}
