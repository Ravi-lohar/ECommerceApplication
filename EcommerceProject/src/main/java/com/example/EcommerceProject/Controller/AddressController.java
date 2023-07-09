package com.example.EcommerceProject.Controller;

import com.example.EcommerceProject.Model.Address;
import com.example.EcommerceProject.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService ;

    @PostMapping("address")
    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }
}
