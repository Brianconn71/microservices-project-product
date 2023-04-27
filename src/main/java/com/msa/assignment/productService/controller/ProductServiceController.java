package com.msa.assignment.productService.controller;

import com.msa.assignment.productService.dao.ProductServiceRepository;
import com.msa.assignment.productService.entity.Product;
import com.msa.assignment.productService.exceptions.ProductNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value="/{id}")
    public ResponseEntity<Product> getFilm(@PathVariable("id") Long id) throws ProductNotFoundException {
        Optional<Product> product = prodRepo.findById(id);
        if(product.isPresent())
            return ResponseEntity.ok().body(product.get());
        else
            throw new ProductNotFoundException("Film was not found " + id);
    }
}

