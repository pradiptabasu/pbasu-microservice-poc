package org.sameerean.springcrud.boot;

import org.sameerean.springcrud.boot.data.UserDataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(value = { "org.sameerean" })
@EnableAutoConfiguration
@EnableJpaRepositories(value = "org.sameerean.springcrud.**.jpa.dao")
@EntityScan(basePackages = { "org.sameerean.springcrud.**.jpa.entity" })
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(
				Application.class, args);
		// SpringApplication.run(Application.class, args);
		 loadAllData(context);
	}

	private static void loadAllData(ApplicationContext context) {
		context.getBean(UserDataLoader.class).loadData();
	}

	// @Bean
	// @Primary
	// @ConfigurationProperties(prefix="datasource.h2")
	// public DataSource dataSource() {
	// return DataSourceBuilder.create().build(); }
}
