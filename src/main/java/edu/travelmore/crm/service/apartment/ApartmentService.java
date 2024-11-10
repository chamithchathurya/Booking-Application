package edu.travelmore.crm.service.apartment;

import edu.travelmore.crm.dto.Apartment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ApartmentService {
    public void addApartment(Apartment apartment);
    public List<Apartment>getAllApartment();
}
