package com.interview.pbasu.cache.monitoring;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.sf.ehcache.management.ManagementService;

//@Configuration
public class CacheMonitoringForEhCache {
//	@Autowired
//	private EhCacheCacheManager ehCacheCacheManager;
//
//	@Bean
//	public MBeanServer mBeanServer() {
//		MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
//		return mBeanServer;
//	}
//
//	@Bean
//	public ManagementService managementService() {
//		ManagementService managementService = new ManagementService(ehCacheCacheManager.getCacheManager(),
//				mBeanServer(), true, true, true, true);
//		managementService.init();
//		return managementService;
//	}
}
