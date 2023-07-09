package com.example.EcommerceProject.Controller;

import com.example.EcommerceProject.Model.Order;
import com.example.EcommerceProject.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService ;

    @PostMapping("order")
    public String createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @GetMapping("order")
    public Order getOrderById(Integer id){
        return orderService.getOrderById(id);
    }
}
