package com.demo.api1;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;



@Configuration
@ComponentScan
@EnableAutoConfiguration

public class API1AppApplication {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}

	
	public static void main(String[] args) {

		SpringApplication.run(API1AppApplication.class, args);
	}

}
