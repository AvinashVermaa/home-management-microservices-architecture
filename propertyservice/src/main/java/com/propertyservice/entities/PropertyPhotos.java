package com.propertyservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="propert_photos")
public class PropertyPhotos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String url;
	
	@ManyToOne
	@JoinColumn(name="property_id")
	private Property property;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "PropertyPhotos [id=" + id + ", url=" + url + ", property=" + property + "]";
	}

	public PropertyPhotos(Long id, String url, Property property) {
		super();
		this.id = id;
		this.url = url;
		this.property = property;
	}

	public PropertyPhotos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
