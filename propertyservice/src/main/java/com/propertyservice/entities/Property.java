package com.propertyservice.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="property")
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column(name="number_of_beds")
	private int numberOfBeds;
	
	@Column(name="number_of_rooms")
	private int numberOfRooms;
	
	@Column(name="number_of_bathrooms")
	private int numberOfBathrooms;
	
	@Column(name="number_of_guests_allowed")
	private int numberOfGuestAllowed;
	
	@ManyToOne
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne
	@JoinColumn(name="area_id")
	private Area area;
	
	@ManyToOne
	@JoinColumn(name="state_id")
	private State state;
	
	@OneToMany(mappedBy = "property",cascade = CascadeType.ALL,orphanRemoval = true)
	@JsonManagedReference
	//used to refer the parent reference
	private List<Rooms> rooms = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}

	public int getNumberOfGuestAllowed() {
		return numberOfGuestAllowed;
	}

	public void setNumberOfGuestAllowed(int numberOfGuestAllowed) {
		this.numberOfGuestAllowed = numberOfGuestAllowed;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + ", numberOfBeds=" + numberOfBeds + ", numberOfRooms="
				+ numberOfRooms + ", numberOfBathrooms=" + numberOfBathrooms + ", numberOfGuestAllowed="
				+ numberOfGuestAllowed + ", city=" + city + ", area=" + area + ", state=" + state + ", rooms=" + rooms
				+ "]";
	}

	public Property(Long id, String name, int numberOfBeds, int numberOfRooms, int numberOfBathrooms,
			int numberOfGuestAllowed, City city, Area area, State state, List<Rooms> rooms) {
		super();
		this.id = id;
		this.name = name;
		this.numberOfBeds = numberOfBeds;
		this.numberOfRooms = numberOfRooms;
		this.numberOfBathrooms = numberOfBathrooms;
		this.numberOfGuestAllowed = numberOfGuestAllowed;
		this.city = city;
		this.area = area;
		this.state = state;
		this.rooms = rooms;
	}

	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
