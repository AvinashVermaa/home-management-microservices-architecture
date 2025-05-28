package com.propertyservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyservice.entities.Rooms;

@Repository
public interface RoomRepository extends JpaRepository<Rooms, Long>{

}
