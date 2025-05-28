package com.propertyservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.propertyservice.entities.RoomAvailability;
import com.propertyservice.entities.Rooms;

@Repository
public interface RoomAvailabilityRepository extends JpaRepository<RoomAvailability, Long>{

	public List<RoomAvailability> findByRoomId(long id);
}
