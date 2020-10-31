package com.example.controller;


import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    public ModelAndView findAll() {
        ModelAndView model = new ModelAndView("products");
        List<Product> products = productService.findAllProducts();
        model.addObject("products", products);
        return model;
    }

    @PostMapping("/product-create")
    public String createProduct(Product product) {
        productService.saveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/product-delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return "redirect:/products";
    }

    @PutMapping("/product-change/{id}")
    public String changeProduct(@PathVariable Long id) {
        productService.saveProduct(productService.findById(id));
        return "redirect:/products";
    }

}
