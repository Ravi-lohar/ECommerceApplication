package com.example.EcommerceProject.Controller;

import com.example.EcommerceProject.Model.User;
import com.example.EcommerceProject.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user/")
public class UserController {
    @Autowired
    UserService userService ;

    @PostMapping("create")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("getUser/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }
}
