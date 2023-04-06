package com.example.demo.service.userService;

import com.example.demo.model.account.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findByUserName(String userName);
    List<User> findAllUsers();
}
