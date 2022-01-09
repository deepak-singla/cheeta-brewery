package com.spring.guru.cheetabrewery.service;

import java.util.UUID;

import com.spring.guru.cheetabrewery.web.model.CustomerDto;

/**
 * Created by jt on 2019-04-21.
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteById(UUID customerId);
}
