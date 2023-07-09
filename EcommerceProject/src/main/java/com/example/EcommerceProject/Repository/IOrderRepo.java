package com.example.EcommerceProject.Repository;

import com.example.EcommerceProject.Model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order, Integer> {
}
