package com.spring.guru.cheetabrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.spring.guru.cheetabrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Crona").beerStyle("light").build();
	}

	@Override
	public BeerDto saveNewBeer(BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID()).build();
	}

}
