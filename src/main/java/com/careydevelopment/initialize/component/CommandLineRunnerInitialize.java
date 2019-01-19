package com.careydevelopment.initialize.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerInitialize implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CommandLineRunnerInitialize.class);
	
	
	@Override
	public void run(String... args) {
		logger.info("This is from CommandLineRunner");
	}	
}
