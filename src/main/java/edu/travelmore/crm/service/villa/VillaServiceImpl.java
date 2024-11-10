package edu.travelmore.crm.service.villa;

import edu.travelmore.crm.dto.Apartment;
import edu.travelmore.crm.dto.Villa;
import edu.travelmore.crm.entity.VillaEntity;
import edu.travelmore.crm.repository.VillaRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class VillaServiceImpl implements VillaService {
    final VillaRepository villaRepository;
    final ModelMapper modelMapper;

    @Override
    public void addVilla(Villa villa) {
        villaRepository.save(modelMapper.map(villa, VillaEntity.class));

    }

    @Override
    public List<Villa> getAllVilla() {
        List<Villa> villaList=new ArrayList<>();
        villaRepository.findAll().forEach(villaEntity -> villaList.add(modelMapper.map(villaEntity, Villa.class)));
        return villaList;
    }
}
