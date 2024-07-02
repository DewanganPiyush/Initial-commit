package com.scaler.piyush.firstapi27june.service;

import com.scaler.piyush.firstapi27june.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{


    @Override
    public Product getSingleproduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}

