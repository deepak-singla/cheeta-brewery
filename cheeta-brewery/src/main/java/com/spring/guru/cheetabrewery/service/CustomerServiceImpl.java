package com.spring.guru.cheetabrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.guru.cheetabrewery.web.model.CustomerDto;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDto getCustomerById(UUID customerId) {
		return CustomerDto.builder().id(UUID.randomUUID()).name("Joe Buck").build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDto customerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerDto saveCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID customerId) {
		// TODO Auto-generated method stub
		
	}

}
