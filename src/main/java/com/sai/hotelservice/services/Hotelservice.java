package com.sai.hotelservice.services;

import java.util.List;

import com.sai.hotelservice.entities.Hotel;

public interface Hotelservice {
	public Hotel create(Hotel hotel);
	public List<Hotel> getAll();
	public Hotel getOneHotel(String hotelId);
}
