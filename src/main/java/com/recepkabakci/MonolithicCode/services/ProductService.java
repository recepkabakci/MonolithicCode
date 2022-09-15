package com.recepkabakci.MonolithicCode.services;

import com.recepkabakci.MonolithicCode.repository.ProductRepository;
import com.recepkabakci.MonolithicCode.repository.entity.Product;
import org.springframework.stereotype.Service;


@Service
public class ProductService extends ServiceManager<Product,Long>{
    private final ProductRepository productRepository;


    public ProductService(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }
}
