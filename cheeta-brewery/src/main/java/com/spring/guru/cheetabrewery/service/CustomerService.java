package com.spring.guru.cheetabrewery.service;

import java.util.UUID;

import com.spring.guru.cheetabrewery.web.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(UUID customerId);

	void updateCustomer(UUID customerId, CustomerDto customerDto);

	CustomerDto saveCustomer(CustomerDto customerDto);

	void deleteById(UUID customerId);
}