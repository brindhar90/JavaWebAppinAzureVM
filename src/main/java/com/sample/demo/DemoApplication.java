package com.sample.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(DemoApplication.class);
		SpringApplication.run(DemoApplication.class, args);
		log.info("Demo app is running..");
	}

}
