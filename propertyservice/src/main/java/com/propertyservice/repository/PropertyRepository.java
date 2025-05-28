package com.propertyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyservice.entities.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long>{

}
