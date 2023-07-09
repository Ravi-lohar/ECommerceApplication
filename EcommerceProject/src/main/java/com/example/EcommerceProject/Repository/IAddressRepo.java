package com.example.EcommerceProject.Repository;

import com.example.EcommerceProject.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address, Integer> {
}
