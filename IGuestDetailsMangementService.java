package com.ht.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ht.entity.GuestDetails;

@Service
public interface IGuestDetailsMangementService {
	public  List<GuestDetails> getAlldetails();
	public String registerGuest(GuestDetails guest);
	public GuestDetails getGuestById(int guestId);
	public String updateGuest(GuestDetails guest);
	public String deleteGuest(int id );
	
}
