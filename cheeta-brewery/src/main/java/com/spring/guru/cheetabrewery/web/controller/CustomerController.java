package com.spring.guru.cheetabrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.spring.guru.cheetabrewery.service.CustomerService;
import com.spring.guru.cheetabrewery.web.model.BeerDto;
import com.spring.guru.cheetabrewery.web.model.CustomerDto;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId) {

		return new ResponseEntity<>(customerService.getCustomerById(customerId), 
				HttpStatus.OK);
	}
	
	@PostMapping // POST - create new beer
	public ResponseEntity<CustomerDto> handlePost(@RequestBody CustomerDto customerDto) {

		CustomerDto savedDto = customerService.saveCustomer(customerDto);

		HttpHeaders headers = new HttpHeaders();
		// todo add hostname to url
		headers.add("Location", "/api/v1/beer/" + savedDto.getId().toString());

		return new ResponseEntity<CustomerDto>(headers, HttpStatus.CREATED);
	}

	@PutMapping({ "/{beerId}" })
	public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDto customerDto) {

		customerService.updateCustomer(customerId, customerDto);

		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}

	@DeleteMapping({ "/{beerId}" })
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteBeer(@PathVariable("customerId") UUID customerId) {
		customerService.deleteById(customerId);
	}


}
