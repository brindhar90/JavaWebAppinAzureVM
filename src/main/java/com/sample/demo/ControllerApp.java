package com.sample.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerApp {
	 private Logger log = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/demo")
	public String getData(@RequestParam(name = "name", required = false, defaultValue = "TCSer")String name) {
		//model.addAttribute("name", name);
		log.info("Received name:" + name);
		return "Hi! This is a demo page for " + name;
	}
	
	@GetMapping("/")
	public String welcome(@RequestParam(name = "name", required = false, defaultValue = "TCSer")String name) {
		log.info("Loaded welcome page");
		return "Hi! This is a demo page for " + name;
	}
	
}
