package com.example.EcommerceProject.Repository;

import com.example.EcommerceProject.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {

    List<Product> findByCategory(String category) ;
}
