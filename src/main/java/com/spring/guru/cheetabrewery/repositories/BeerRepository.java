package com.spring.guru.cheetabrewery.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.guru.cheetabrewery.domain.Beer;

public interface BeerRepository extends JpaRepository<Beer, UUID> {

}
