package com.example.demo.service.userService;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.account.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public interface UserService {
    User saveUser(UserDTO userDTO);
    User findByUserName(String userName);
    List<User> findAllUsers();
}
