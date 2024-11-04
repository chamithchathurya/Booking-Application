package edu.travelmore.crm.service;

import edu.travelmore.crm.dto.User;
import edu.travelmore.crm.entity.UserEntity;
import edu.travelmore.crm.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    final UserRepository repository;
    final ModelMapper modelMapper;

    public List<User> getUser(){
        List<User> usersList=new ArrayList<>();
        repository.findAll().forEach(user-> usersList.add(modelMapper.map(user, User.class)));
        return usersList;
    }

    @Override
    public void addUser(User user) {
        repository.save(modelMapper.map(user, UserEntity.class));

    }
}
