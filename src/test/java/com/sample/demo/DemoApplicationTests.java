package com.sample.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DemoApplicationTests {

	 private Logger log = LoggerFactory.getLogger(this.getClass());
	 
	@Autowired
	private MockMvc mvc;

	@Test
	public void testController() throws Exception {
		/*
		 * mvc.perform(MockMvcRequestBuilders.get("/demo?name=test").accept(MediaType.
		 * APPLICATION_JSON)) .andExpect(status().isOk());
		 * .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
		 */
		mvc.perform(get("/demo")).andExpect(status().isOk()).andExpect(content().string("Hi! This is a demo page for TCSer"));

		log.debug("Test completed successfully.");
	}

}
