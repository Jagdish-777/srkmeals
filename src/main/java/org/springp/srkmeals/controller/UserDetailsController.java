package org.springp.srkmeals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springp.srkmeals.entity.UserDetails;
import org.springp.srkmeals.service.UserDetailService;

@RestController
public class UserDetailsController {
    
    @Autowired
    private UserDetailService userDetailService;

    @PostMapping("/saveUser")
    public UserDetails saveUser(@RequestBody UserDetails userDetails) {


        return userDetailService.saveUser(userDetails);

    }

    @GetMapping("/getAllUsers")
    public List<UserDetails> getAllUsers() {


        return userDetailService.getAllUsers();

    }

}
