package com.propertyservice.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="room_availability")
public class RoomAvailability {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private LocalDate availableDate;
	
	private int availableCount;
	
	private double price;
	
	@ManyToOne
	@JoinColumn(name="room_id")
	private Rooms room;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(LocalDate availableDate) {
		this.availableDate = availableDate;
	}

	public int getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Rooms getRoom() {
		return room;
	}

	public void setRoom(Rooms room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "RoomAvailability [id=" + id + ", availableDate=" + availableDate + ", availableCount=" + availableCount
				+ ", price=" + price + ", room=" + room + "]";
	}

	public RoomAvailability(Long id, LocalDate availableDate, int availableCount, double price, Rooms room) {
		super();
		this.id = id;
		this.availableDate = availableDate;
		this.availableCount = availableCount;
		this.price = price;
		this.room = room;
	}

	public RoomAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

