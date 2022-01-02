package com.spring.guru.cheetabrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.guru.cheetabrewery.web.model.BeerDto;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID beerId) {
		return BeerDto.builder().id(UUID.randomUUID()).beerName("Crona").beerStyle("light").build();
	}

	@Override
	public BeerDto saveNewBeer(@RequestBody BeerDto beerDto) {
		return BeerDto.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateBeer(UUID beerId, @RequestBody BeerDto beerDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub
		
	}

}
