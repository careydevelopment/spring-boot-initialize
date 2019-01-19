package com.careydevelopment.initialize.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EventListenerInitialize {

	private static final Logger logger = LoggerFactory.getLogger(EventListenerInitialize.class);
	
	@EventListener(ApplicationReadyEvent.class)
	public void initializeSomething() {
		logger.info("I am now initializing something!");
	}
}
