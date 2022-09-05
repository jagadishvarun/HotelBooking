package com.jagadish.service;

import java.util.List;


import com.jagadish.entity.Hotel;


public interface HotelService {

	public Hotel addHotel(Hotel hotelEntity) ;
	
	public List<Hotel> getAllHotelDetails();

	public Hotel getHotelById(int hid);

	public void deleteHotelById(int id);
	
   
	
}
