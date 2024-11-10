package edu.travelmore.crm.controller;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.dto.Villa;
import edu.travelmore.crm.service.apartment.ApartmentService;
import edu.travelmore.crm.service.villa.VillaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin

public class VillaControl {
   final VillaService service;

   @PostMapping("/add-villa")
   public void addVilla(@RequestBody Villa villa){
      service.addVilla(villa);
   }
   @GetMapping("/get-all-villa")
   public List<Villa> getAllVilla(){
      return service.getAllVilla();
   }
}
