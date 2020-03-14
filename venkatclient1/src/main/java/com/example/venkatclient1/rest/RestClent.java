package com.example.venkatclient1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.venkatclient1.model.Employee;

@RestController
@RequestMapping("/rest/client")
public class RestClent {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody final Employee employee){
		 
				 Employee response = restTemplate.postForObject("http://venkatservice1/rest/service/save",employee,Employee.class);
				 
				 return response;
	}

}
