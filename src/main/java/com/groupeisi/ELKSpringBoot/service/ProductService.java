package com.groupeisi.ELKSpringBoot.service;

import com.groupeisi.ELKSpringBoot.entities.Product;
import com.groupeisi.ELKSpringBoot.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public Iterable<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }
}