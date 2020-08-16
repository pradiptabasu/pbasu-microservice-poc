package com.interview.pbasu.repositories;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.interview.pbasu.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	Product findByProductSerial(UUID productSerial);
	List<Product> findByProductSKU(String productSKU);
    List<Product> findByProductNameContaining(String productName);
    List<Product> findByProductBrand(String productBrand);
    List<Product> findByProductColor(String productColor);
    List<Product> findByProductSize(String productSize);
    List<Product> findBylastUpdatedBefore(Date lastUpdated);
    List<Product> findByLastUpdatedInCacheStatusOrderByLastUpdatedAsc(Boolean lastUpdatedInCacheStatus);
    List<Product> findByLastUpdatedInCacheStatus(Boolean lastUpdatedInCacheStatus);
    long countByproductSKU(String productSKU);
    long countByProductSeller(String productSeller);
    
//    @Query("SELECT o FROM PRODUCT o WHERE o.lastUpdated BETWEEN :from AND :to AND o.status = :status AND o.terminal.deviceId = :deviceId AND o.trainingMode = :trainingMode")
//    List<Product> findOperations(@Param("from") Date startDay,
//                                                   @Param("to") Date endDay,
//                                                   @Param("status") OperationStatus status,
//                                                   @Param("deviceId") String deviceId,
//                                                   @Param("trainingMode") boolean trainingMode);
}