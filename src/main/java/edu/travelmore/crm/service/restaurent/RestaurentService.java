package edu.travelmore.crm.service.restaurent;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.dto.Restaurent;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RestaurentService {
    public void addRestaurent(Restaurent restaurent);


    public List<Restaurent> getAllRestaurent();
}
