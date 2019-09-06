package com.example.client.RestClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestClientApplication {

	private static final Logger logger = LoggerFactory.getLogger(RestClientApplication.class);
	
		public static void main(String args[]) {
			SpringApplication.run(RestClientApplication.class);
			
			
		/*
		 * }
		 * 
		 * @Bean public RestTemplate restTemplate(RestTemplateBuilder builder) { return
		 * builder.build(); }
		 * 
		 * @Bean public CommandLineRunner run(RestTemplate restTemplate) throws
		 * Exception { return args -> { RestTemplate resttemplate = new RestTemplate();
		 * Notes notes =resttemplate.getForObject("http://localhost:8080/api/notes",
		 * Notes.class); logger.info(notes.toString()); };
		 */
		}
		@Bean
		public RestTemplate restTemplate() {
		    return new RestTemplate();
		}

}
