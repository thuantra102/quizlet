package com.example.demo.service.userService;

import com.example.demo.model.account.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailsService {
   @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElse(null);
        if(user == null) {
            throw new UsernameNotFoundException(username);
        }
        return  new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(), new ArrayList<>());
    }
}
