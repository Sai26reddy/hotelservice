package com.sai.hotelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sai.hotelservice.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
