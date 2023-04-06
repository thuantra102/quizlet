package com.example.demo.service.userService;

import com.example.demo.model.account.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User findByUserName(String userName) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }
}
