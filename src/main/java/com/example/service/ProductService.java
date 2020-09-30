package com.example.service;


import com.example.model.Product;
import com.example.productRepo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    @Autowired
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    public Product findById(long id) {
        return productRepo.getOne(id);
    }

    public List<Product> findAllProducts() {
        return productRepo.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }


    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }
}
