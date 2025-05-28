package com.propertyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyservice.entities.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long>{

	public Area findByName(String name);
}
