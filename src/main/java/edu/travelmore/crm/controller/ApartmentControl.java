package edu.travelmore.crm.controller;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.service.apartment.ApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin

public class ApartmentControl {
   final ApartmentService service;

   @PostMapping("/add-apartment")
   public void addApartment(@RequestBody Apartment apartment){
      service.addApartment(apartment);
   }
}
