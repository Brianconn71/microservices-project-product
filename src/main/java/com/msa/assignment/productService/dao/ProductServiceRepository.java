package com.msa.assignment.productService.dao;


import com.msa.assignment.productService.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductServiceRepository extends JpaRepository<Product, Long> {
}
