package com.sai.hotelservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.hotelservice.entities.Hotel;
import com.sai.hotelservice.services.Hotelservice;

@RestController
@RequestMapping("/hotels")
public class HotelServiceController {
	@Autowired
	Hotelservice hotelservice;
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
		Hotel hotel = hotelservice.getOneHotel(hotelId);
		return ResponseEntity.ok(hotel);
	}
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotels(){
		
		List<Hotel> hotels =  hotelservice.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(hotels);
	}
	
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		Hotel hotel1 = hotelservice.create(hotel);
		return ResponseEntity.ok(hotel1);
	}
}
