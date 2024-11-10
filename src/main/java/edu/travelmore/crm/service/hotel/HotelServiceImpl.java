package edu.travelmore.crm.service.hotel;

import edu.travelmore.crm.dto.Hotel;
import edu.travelmore.crm.entity.HotelEntity;
import edu.travelmore.crm.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class HotelServiceImpl implements HotelService{
    final HotelRepository hotelRepository;
    final ModelMapper modelMapper;

    @Override
    public void addHotel(Hotel hotel) {
        hotelRepository.save(modelMapper.map(hotel, HotelEntity.class));

    }

    @Override
    public List<Hotel> getAllHotel() {
        List<Hotel>hotelList=new ArrayList<>();
        hotelRepository.findAll().forEach(hotelEntity -> hotelList.add(modelMapper.map(hotelEntity, Hotel.class)));
        return hotelList;
    }
}
