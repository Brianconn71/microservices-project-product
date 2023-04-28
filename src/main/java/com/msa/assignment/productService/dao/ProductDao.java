package com.msa.assignment.productService.dao;

import com.msa.assignment.productService.entity.Product;
import com.msa.assignment.productService.repository.ProductServiceRepository;
import com.msa.assignment.productService.utils.SleepUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDao {

    @Autowired
    static
    ProductServiceRepository prodRepo;

    public static Product getById(Long id, int delayMs){
        SleepUtils.sleep(delayMs);
        return prodRepo.findById(id).get();
    }
}
