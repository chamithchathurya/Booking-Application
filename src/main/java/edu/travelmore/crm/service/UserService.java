package edu.travelmore.crm.service;

import edu.travelmore.crm.dto.User;

import java.util.List;

public interface UserService  {
    public List<User> getUser();

    public void addUser(User user);

}
