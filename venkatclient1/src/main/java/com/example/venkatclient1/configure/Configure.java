package com.example.venkatclient1.configure;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Configure {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		
		return new RestTemplate();
		
	}

}
