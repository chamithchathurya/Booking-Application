package edu.travelmore.crm.service.hotel;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.dto.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    public void addHotel(Hotel hotel);

    public List<Hotel> getAllHotel();
}
