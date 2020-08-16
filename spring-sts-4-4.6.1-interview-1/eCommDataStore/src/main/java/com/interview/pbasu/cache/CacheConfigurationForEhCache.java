package com.interview.pbasu.cache;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;


//@Configuration
//@EnableCaching(mode = AdviceMode.ASPECTJ)
//@EnableCaching
public class CacheConfigurationForEhCache {
//    @Bean
//    public EhCacheManagerFactoryBean ehCacheManagerFactory() {
//    	ClassPathResource configLocation = new ClassPathResource("ehcache.xml");
//        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
//        cacheManagerFactoryBean.setConfigLocation(configLocation);
//        cacheManagerFactoryBean.setShared(true);
//        return cacheManagerFactoryBean;
//    }
// 
//    @Bean
//    public EhCacheCacheManager ehCacheCacheManager() {
//        EhCacheCacheManager cacheManager = new EhCacheCacheManager();
//        cacheManager.setCacheManager(ehCacheManagerFactory().getObject());
//        cacheManager.setTransactionAware(true);
//        return cacheManager;
//    }
}
