<<<<<<< HEAD
package com.sample.demo;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerApp {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	/*
	 * @GetMapping("/demo") public String getData(@RequestParam(name = "name",
	 * required = false, defaultValue = "TCSer")String name) {
	 * //model.addAttribute("name", name); log.info("Received name:" + name); return
	 * "Hi! This is a demo page for " + name; }
	 * 
	 * @GetMapping("/") public String welcome(@RequestParam(name = "name", required
	 * = false, defaultValue = "TCSer")String name) {
	 * log.info("Loaded welcome page"); return "Hi! This is a demo page for " +
	 * name; }
	 * 
	 * @RequestMapping(value = "/index") public String index() { return "index"; }
	 */

	// inject via application.properties
	@Value("${welcome.message}")
	private String message;

	private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message", message);
		model.addAttribute("tasks", tasks);
		log.debug("Invoked / method");
		return "welcome"; // view
	}

	@GetMapping("/demo")
	public String mainWithParam(@RequestParam(name = "name", required = false, defaultValue = "") String name,
			Model model) {
		model.addAttribute("message", name);
		log.debug("Invoked /demo method");
		return "welcome"; // view
	}

}
