package com.UserManagement.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserManagement.Model.User;
import com.UserManagement.Service.UserService;


@RequestMapping("common/v1")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id)
    {
    	Optional<User> user=userService.getUser(id);
        return user.get();
    }
    
    @GetMapping("/user")
    public String getUser()
    {
        return "Hello my name is soumendu";
    }
}
