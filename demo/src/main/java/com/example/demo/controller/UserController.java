package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.account.User;
import com.example.demo.service.userService.UserService;
import com.example.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    JwtUtil jwtUtil;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    private UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<?> register(@RequestBody UserDTO userDTO) {
        if(userService.findByUserName(userDTO.getUserName()) != null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(userService.saveUser(userDTO), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userDTO.getUserName(), userDTO.getPassWord());
        authenticationManager.authenticate(token);
        String jwtToken = jwtUtil.generate(userDTO.getUserName());
        return ResponseEntity.ok(jwtToken);
    }

}
