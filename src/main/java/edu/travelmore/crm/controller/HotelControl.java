package edu.travelmore.crm.controller;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.dto.Hotel;
import edu.travelmore.crm.service.apartment.ApartmentService;
import edu.travelmore.crm.service.hotel.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin

public class HotelControl {
   final HotelService service;

   @PostMapping("/add-hotel")
   public void addHotel(@RequestBody Hotel hotel){
      service.addHotel(hotel);
   }
   @GetMapping("/get-all-hotel")
   public List<Hotel> getAllHotel(){
      return service.getAllHotel();
   }
}
