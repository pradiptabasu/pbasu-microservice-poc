package com.interview.pbasu.cache.customizer;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.cache.CacheManagerCustomizer;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.stereotype.Component;

//@Component
//public class CacheCustomizerForSimpleCache  implements CacheManagerCustomizer<ConcurrentMapCacheManager> {
//    @Override
//    public void customize(ConcurrentMapCacheManager cacheManager) {
//        cacheManager.setCacheNames(Arrays.asList("allProducts", "availableProducts"));
//    }
//}

//instead of the above, I am using @Bean in com.interview.pbasu.cache.CacheConfigurationForSimpleCache for customizations also
public class CacheCustomizerForSimpleCache{
}
