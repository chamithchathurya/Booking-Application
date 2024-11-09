package edu.travelmore.crm.service.apartment;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.entity.ApartmentEntity;
import edu.travelmore.crm.repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ApartmentServiceImpl implements ApartmentService{
    final ApartmentRepository repository;
    final ModelMapper modelMapper;

    @Override
    public void addApartment(Apartment apartment) {
        repository.save(modelMapper.map(apartment, ApartmentEntity.class));
    }
}
