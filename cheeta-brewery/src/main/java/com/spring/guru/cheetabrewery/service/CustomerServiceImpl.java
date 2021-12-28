package com.spring.guru.cheetabrewery.service;

import java.util.UUID;

import com.spring.guru.cheetabrewery.web.model.CustomerDto;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID()).name("Joe Buck").build();
	}

}
