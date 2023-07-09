package com.example.EcommerceProject.Service;

import com.example.EcommerceProject.Model.User;
import com.example.EcommerceProject.Repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String createUser(User user) {
        userRepo.save(user);
        return "User Created Successfully";
    }

    public User getUserById(Integer id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }
}
