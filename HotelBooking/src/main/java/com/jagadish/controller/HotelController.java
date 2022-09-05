package com.jagadish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jagadish.entity.Hotel;
import com.jagadish.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/hotel/save")
	public ResponseEntity<?> addHotel(@RequestBody Hotel hotelEntity){
	
		
		Hotel hotel = hotelService.addHotel(hotelEntity);
		
		return new ResponseEntity<Hotel>(hotel,HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/hotel/all")
	public ResponseEntity<List<Hotel>> getAllHotelDetails(){
		
		List<Hotel> list = hotelService.getAllHotelDetails();
		return new ResponseEntity<List<Hotel>>(list,HttpStatus.CREATED);
	}
	
	@GetMapping("/hotel/{id}")
	public ResponseEntity<?> getHotelById(@PathVariable("id") int id){
		Hotel h = hotelService.getHotelById(id);
		return new ResponseEntity<Hotel>(h, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("/hotel/{hid}")
	public ResponseEntity<Void> deleteHotelById(@PathVariable("hid") int hid ){
		
		hotelService.deleteHotelById(hid);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/hotel/update")
	public ResponseEntity<Hotel> updateEmployee(@RequestBody Hotel hotelEntity){
		Hotel hotelsaved = hotelService.addHotel(hotelEntity);
		return new ResponseEntity<Hotel>(hotelsaved, HttpStatus.CREATED);
	}
	
	
}
