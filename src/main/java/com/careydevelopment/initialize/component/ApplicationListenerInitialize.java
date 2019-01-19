package com.careydevelopment.initialize.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationListenerInitialize implements ApplicationListener<ApplicationReadyEvent>  {
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationListenerInitialize.class);

	public void onApplicationEvent(ApplicationReadyEvent event) {
		logger.info("I waited until Spring Boot finished before getting here!");
	}
}
