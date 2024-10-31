package edu.travelmore.crm.controller;

import edu.travelmore.crm.dto.User;
import edu.travelmore.crm.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserControl {
    @GetMapping("/getUser")
    public User getUser(){
        UserService service=new UserService();
        return service.getUser();
    }
}
