package com.example.EcommerceProject.Service;

import com.example.EcommerceProject.Model.Product;
import com.example.EcommerceProject.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    IProductRepo productRepo ;

    public String createProduct(Product product) {
        productRepo.save(product);
        return "Product Created Successfully";
    }

    public List<Product> getAllProductByCategory(String category) {
        return productRepo.findByCategory(category);
    }

    public String deleteProductById(Integer id) {
        Optional<Product> product = productRepo.findById(id);
        if(product.isPresent()){
            productRepo.deleteById(id);
            return  "Product Deleted Successfully";
        }



        return "Product Id not found" ;
    }
}
