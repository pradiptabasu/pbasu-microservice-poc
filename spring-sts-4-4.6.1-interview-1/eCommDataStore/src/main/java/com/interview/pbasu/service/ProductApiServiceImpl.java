package com.interview.pbasu.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import com.interview.pbasu.domain.Product;
import com.interview.pbasu.repositories.ProductRepository;

@Service
public class ProductApiServiceImpl implements ProductApiService{
    
	@Autowired
    private ProductRepository productRepository;
	
    @Override
    @Caching(evict = {
    	    @CacheEvict(value = "products", key = "'findAllProducts '"),
    	    @CacheEvict(value = "products", key = "'findAllAvailableProducts '"),
    	    @CacheEvict(value = "products", key = "#product.getProductSKU()"),
    	    @CacheEvict(value = "products", key = "#product.getProductName()"),
    	    @CacheEvict(value = "products", key = "#product.getProductBrand()"),
    	    @CacheEvict(value = "products", key = "#product.getProductColor()"),
    	    @CacheEvict(value = "products", key = "#product.getProductSize()")
    	}, put = {
    		@CachePut(value = "products", key = "#product.getProductSerial()")
    	})
	public Product createProduct(Product product)
	{
		return productRepository.save(product);
	}
	
    @Override
    @Cacheable(value="products", key="#root.method.name")
	public List<Product> findAllProducts()
	{
    	List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}
	
    @Override
    @Cacheable(value="products", key="#root.method.name")
	public List<Product> findAllAvailableProducts()
	{
    	List<Product> products = (List<Product>) productRepository.findAll();
    	return products.stream().filter(p -> p.getInventoryStatus().equalsIgnoreCase("AVAILABLE")).collect(Collectors.toList());
	}
	
    @Override
    @Cacheable(value="products", key="#productSerial")
	public Product findByProductSerial(UUID productSerial)
	{
    	Product product = productRepository.findByProductSerial(productSerial);
		return product;
	}
    
    @Override
    @Cacheable(value="products", key="#productSKU")
	public List<Product> findByProductSKU(String productSKU)
	{
    	List<Product> products = (List<Product>) productRepository.findByProductSKU(productSKU);
    	return products.stream().filter(p -> p.getInventoryStatus().equalsIgnoreCase("AVAILABLE")).collect(Collectors.toList());
	}
	
    @Override
    @Cacheable(value="products", key="#productName")
	public List<Product> findByProductNameContaining(String productName)
	{
    	List<Product> products = (List<Product>) productRepository.findByProductNameContaining(productName);
    	return products.stream().filter(p -> p.getInventoryStatus().equalsIgnoreCase("AVAILABLE")).collect(Collectors.toList());
	}
	
    @Override
    @Cacheable(value="products", key="#productBrand")
	public List<Product> findByProductBrand(String productBrand)
	{
    	List<Product> products = (List<Product>) productRepository.findByProductBrand(productBrand);
    	return products.stream().filter(p -> p.getInventoryStatus().equalsIgnoreCase("AVAILABLE")).collect(Collectors.toList());
	}
	
    @Override
    @Cacheable(value="products", key="#productColor")
	public List<Product> findByProductColor(String productColor)
	{
    	List<Product> products = (List<Product>) productRepository.findByProductColor(productColor);
    	return products.stream().filter(p -> p.getInventoryStatus().equalsIgnoreCase("AVAILABLE")).collect(Collectors.toList());
	}
	
    @Override
    @Cacheable(value="products", key="#productSize")
	public List<Product> findByProductSize(String productSize)
	{
    	List<Product> products = (List<Product>) productRepository.findByProductSize(productSize);
    	return products.stream().filter(p -> p.getInventoryStatus().equalsIgnoreCase("AVAILABLE")).collect(Collectors.toList());
	}
	
    @Override
	public long countByproductSKU(String productSKU)
	{
    	return productRepository.countByproductSKU(productSKU);
	}
	
    @Override
	public long countByProductSeller(String productSeller)
	{
    	return productRepository.countByProductSeller(productSeller);
	}
}
