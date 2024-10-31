package edu.travelmore.crm.service;

import edu.travelmore.crm.dto.User;

public class UserService {

    public User getUser(){
        return new User(
                "100012",
                "Chamith Chathurya",
                "chamith@gmail.com",
                "Chamith1234",
                "User");

    }
}
