package edu.travelmore.crm.controller;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.dto.Restaurent;
import edu.travelmore.crm.service.apartment.ApartmentService;
import edu.travelmore.crm.service.restaurent.RestaurentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin

public class RestaurentControl {
   final RestaurentService service;

   @PostMapping("/add-restaurent")
   public void addRestaurent(@RequestBody Restaurent restaurent){
      service.addRestaurent(restaurent);
   }


   @GetMapping("/get-all-restaurent")
   public List<Restaurent> getAllRestaurent(){
      return service.getAllRestaurent();
   }
}
