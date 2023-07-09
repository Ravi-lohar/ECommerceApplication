package com.example.EcommerceProject.Service;

import com.example.EcommerceProject.Model.Order;
import com.example.EcommerceProject.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo ;

    public String createOrder(Order order) {
        orderRepo.save(order);
        return "orderPlaced successfully" ;
    }

    public Order getOrderById(Integer id) {
        Optional<Order> order = orderRepo.findById(id);
        if(order.isPresent()){
            return order.get();
        }
        return null ;
    }
}
