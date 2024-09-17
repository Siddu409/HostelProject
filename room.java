package com.ht.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Room {
	@Id
	private Integer id;

	private int roomNo;
	private int sharingType;

    @ManyToOne
    @JoinColumn(name = "guestId")  // Foreign key column in Room table
    private GuestDetails guestDetails;

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomNo=" + roomNo + ", sharingType=" + sharingType + ", guestDetails="
				+ guestDetails + "]";
	}
    
    
}
