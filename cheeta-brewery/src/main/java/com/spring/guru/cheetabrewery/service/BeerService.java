package com.spring.guru.cheetabrewery.service;

import java.util.UUID;

import com.spring.guru.cheetabrewery.web.model.BeerDto;

public interface BeerService {
	BeerDto getBeerById(UUID beerId);
	
	BeerDto saveNewBeer(BeerDto beerDto);

	void updateBeer(UUID beerId, BeerDto beerDto);

	void deleteById(UUID beerId);
}
