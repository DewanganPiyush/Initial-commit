package com.scaler.piyush.firstapi27june.controller;


import com.scaler.piyush.firstapi27june.model.Product;
import org.springframework.web.bind.annotation.*;
import com.scaler.piyush.firstapi27june.service.ProductService;

@RestController
public class ProductController {


    private ProductService productService;

    public ProductController(ProductService productService){

        this.productService = productService;
    }

    //response body
    // {
    //        title:
    //        description:
    //        price:
    // }
    @PostMapping("/products") //spring knows whenever an http post request with this /products endpoints call this method.
    public void createproduct(){

    }

    @GetMapping("/prducts/{id}")            // path variable
    public Product getProductDetails(@PathVariable Long productId){
        return productService.getSingleproduct(productId);
        }

    @GetMapping("/products")
    public void getAllProduct() {

    }

    @PutMapping("/products")
    public void updateProduct() {

    }

    // GET /products/1
        // GET /products/101

    }



