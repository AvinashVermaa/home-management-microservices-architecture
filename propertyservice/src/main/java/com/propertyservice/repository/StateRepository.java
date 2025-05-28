package com.propertyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyservice.entities.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

	public State findByName(String name);
}
