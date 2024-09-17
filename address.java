package com.ht.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	private Integer id;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private Integer pincode;
	private String country;
	
	  @ManyToOne
	    @JoinColumn(name = "guestId")  // Foreign key column in Address table
	    private GuestDetails guestDetails;

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city="
				+ city + ", pincode=" + pincode + ", country=" + country + ", guestDetails=" + guestDetails + "]";
	}
	  
	  
	  
	  
}
