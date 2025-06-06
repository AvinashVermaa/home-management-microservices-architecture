package com.propertyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyservice.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City,Long>{

	public City findByName(String name);
}
