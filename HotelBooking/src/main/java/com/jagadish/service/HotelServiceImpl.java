package com.jagadish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagadish.entity.Hotel;
import com.jagadish.exception.HotelNotFoundException;
import com.jagadish.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;
	

	@Override
	public Hotel addHotel(Hotel hotelEntity) {
		
		Hotel hotel = hotelRepository.save(hotelEntity);
		return hotel;
		
	}

	@Override
	public List<Hotel> getAllHotelDetails() {
		List<Hotel> hotelList = null;
		
			hotelList = hotelRepository.findAll();

		return hotelList;
	}

	@Override
	public Hotel getHotelById(int hid) {
		
       if(hotelRepository.findById(hid).isEmpty()) {
    	   throw new HotelNotFoundException("Requested Hotel id does not exist");
       }
		return hotelRepository.findById(hid).get();

	}

	@Override
	public void deleteHotelById(int id) {
		
		if(hotelRepository.findById(id).isEmpty()) {
			 throw new HotelNotFoundException("Requested Hotel id does not exist");
		}
		else {
         hotelRepository.deleteById(id); 
		}
	}

	
	

	
	
	

}
