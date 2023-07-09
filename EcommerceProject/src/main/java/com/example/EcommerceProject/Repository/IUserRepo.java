package com.example.EcommerceProject.Repository;

import com.example.EcommerceProject.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends CrudRepository<User, Integer> {
}
