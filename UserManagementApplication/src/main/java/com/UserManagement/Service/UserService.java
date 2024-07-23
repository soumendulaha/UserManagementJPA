package com.UserManagement.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserManagement.Model.User;
import com.UserManagement.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public Optional<User> getUser(Long id)
    {
        return userRepo.findById(id);
    }
}
