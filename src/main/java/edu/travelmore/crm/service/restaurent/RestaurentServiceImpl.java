package edu.travelmore.crm.service.restaurent;

import edu.travelmore.crm.dto.Restaurent;
import edu.travelmore.crm.entity.RestaurentEntity;
import edu.travelmore.crm.repository.RestaurentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class RestaurentServiceImpl implements RestaurentService{
    final RestaurentRepository restaurentRepository;
    final ModelMapper modelMapper;

    @Override
    public void addRestaurent(Restaurent restaurent) {
        restaurentRepository.save(modelMapper.map(restaurent, RestaurentEntity.class));

    }

    @Override
    public List<Restaurent> getAllRestaurent() {
        List<Restaurent> restaurentList=new ArrayList<>();
        restaurentRepository.findAll().forEach(restaurentEntity -> restaurentList.add(modelMapper.map(restaurentEntity, Restaurent.class)));
        return restaurentList;
    }
}
