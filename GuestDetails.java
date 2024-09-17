package com.ht.entity;

import java.io.Serializable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Table(name="GUEST_DETAILS")
@Data
@Entity
public class GuestDetails implements Serializable {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "guest_id_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer guestId;
	private String guestName;
//	private String guestphoneNumber;
 private Set<Long> guestphoneNumber;
	private String guestEmail;
	private LocalDate dateofbirth;
	private String qualification;
	private String working;
//	private String emergencyContact;
	 private Set<Long> emergencyContact;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // adjust cascade as needed
	    @JoinColumn(name = "guestId")
	private List<Address> address;
	

	 @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // adjust cascade as needed
	    @JoinColumn(name = "guestId")
	private List<Room> room;


	@Override
	public String toString() {
		return "GuestDetails [guestId=" + guestId + ", guestName=" + guestName + ", guestphoneNumber="
				+ guestphoneNumber + ", guestEmail=" + guestEmail + ", dateofbirth=" + dateofbirth + ", qualification="
				+ qualification + ", working=" + working + ", emergencyContact=" + emergencyContact + ", address="
				+ address + ", room=" + room + "]";
	}
	 
	 
	 
	 
	 

}
