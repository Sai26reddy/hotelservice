package com.sai.hotelservice.servicesImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.hotelservice.entities.Hotel;
import com.sai.hotelservice.exception.ResourceNotFoundException;
import com.sai.hotelservice.repositories.HotelRepository;
import com.sai.hotelservice.services.Hotelservice;

@Service
public class HotelServicesImpl implements Hotelservice{
	
	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getOneHotel(String hotelId) {
		return hotelRepository.findById(hotelId).orElseThrow(()->new ResourceNotFoundException("The given id is not present in the server"));
	}

}
