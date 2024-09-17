package com.ht.service;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ht.entity.GuestDetails;
import com.ht.repo.IGuestDetailsRepository;

@Component
public class GuestDetailsManagementServiceImpl implements IGuestDetailsMangementService{
	
	@Autowired
	private  IGuestDetailsRepository  guestrepo; 

	@Override
	public List<GuestDetails> getAlldetails() {
	 List<GuestDetails> all = guestrepo.findAll();
	     
	         
	      
	         
	         return all;
	}

	@Override
	public String registerGuest(GuestDetails guest) {
		return "Guest is saved with Id value::" +guestrepo.save(guest).getGuestId();
	}

	@Override
	public GuestDetails getGuestById(int guestId) {
		GuestDetails guest=guestrepo.findById(guestId).orElseThrow(()->new IllegalArgumentException());
		return  guest ;
	}

	@Override
	public String updateGuest(GuestDetails guest) {
		return "Guest is updated with id value:: "+guestrepo.save(guest).getGuestId();
	}

	@Override
	public String deleteGuest( int id) {
		guestrepo.deleteById(id);
		 return "Guest is updated with id value:: ";
	}
}

