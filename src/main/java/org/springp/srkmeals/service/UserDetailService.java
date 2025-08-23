package org.springp.srkmeals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springp.srkmeals.entity.UserDetails;
import org.springp.srkmeals.repository.UserDetailsRepo;

@Service
public class UserDetailService {

    @Autowired
    private UserDetailsRepo userDetailsRepo;

    public UserDetails saveUser(UserDetails userDetails) {
        return userDetailsRepo.save(userDetails);
    }

    public List<UserDetails> getAllUsers() {
        return userDetailsRepo.findAll();
    }

}
