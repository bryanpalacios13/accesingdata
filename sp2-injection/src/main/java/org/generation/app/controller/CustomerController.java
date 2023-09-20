package org.generation.app.controller;

import org.generation.app.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CustomerController {
	
	//@Autowired 
	Customer customer;
	

	@GetMapping("api/customers")
	public Customer getCustomerById() {
		customer.setFirstName("Pato");
		customer.setLastName("Donald");
		customer.setEmail("pato@gmail.com");
		
		return customer;
	}
}