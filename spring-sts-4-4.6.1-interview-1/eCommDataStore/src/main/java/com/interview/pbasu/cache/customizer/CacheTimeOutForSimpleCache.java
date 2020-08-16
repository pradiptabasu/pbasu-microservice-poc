package com.interview.pbasu.cache.customizer;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CacheTimeOutForSimpleCache {

	//@CacheEvict(allEntries = true, cacheNames = { "products", "availableProducts" })
	@CacheEvict(allEntries = true, cacheNames = {"products"})
	@Scheduled(fixedDelay = 30000)
	public void cacheEvict() {
	}
	
}
