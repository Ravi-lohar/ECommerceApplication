package com.example.EcommerceProject.Controller;

import com.example.EcommerceProject.Model.Product;
import com.example.EcommerceProject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "product/")
public class ProductController {
    @Autowired
    ProductService productService ;

    @PostMapping("create")
    public String createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }

    @GetMapping("category")
    public List<Product> getAllProductByCategory(String category){
        return productService.getAllProductByCategory(category);
    }
    @DeleteMapping("delete/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }



}
