package com.msa.assignment.productService.controller;

import com.msa.assignment.productService.dao.ProductServiceRepository;
import com.msa.assignment.productService.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductServiceController {


    private final ProductServiceRepository prodRepo;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return prodRepo.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduct(@RequestBody Product product){
        prodRepo.save(product);
    }
}

