package com.careydevelopment.initialize.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	private static final Logger logger = LoggerFactory.getLogger(AppConfig.class);
	
	@Bean
	public SmartInitializingSingleton initialize() {
		return () -> {
			logger.info("This was from the smart initializing bean");
		};
	}
}
