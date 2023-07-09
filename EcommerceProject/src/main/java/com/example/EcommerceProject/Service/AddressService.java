package com.example.EcommerceProject.Service;

import com.example.EcommerceProject.Model.Address;
import com.example.EcommerceProject.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo ;


    public String createAddress(Address address) {
        addressRepo.save(address);
        return "Address Created Successfully" ;
    }
}
