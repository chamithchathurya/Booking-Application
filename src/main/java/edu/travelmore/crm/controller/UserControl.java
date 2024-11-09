package edu.travelmore.crm.controller;

import edu.travelmore.crm.dto.User;
import edu.travelmore.crm.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor


public class UserControl {

    final UserService service;

    @GetMapping("/get-user")
    public List<User> getUser(){
        return service.getUser();
    }
    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        service.addUser(user);

    }
}
