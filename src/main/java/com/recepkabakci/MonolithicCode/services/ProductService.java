package com.recepkabakci.MonolithicCode.services;

import com.recepkabakci.MonolithicCode.dto.request.ProductSaveRequestDto;
import com.recepkabakci.MonolithicCode.mapper.ProductMapper;
import com.recepkabakci.MonolithicCode.repository.ProductRepository;
import com.recepkabakci.MonolithicCode.repository.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ProductService extends ServiceManager<Product,Long>{
    private final ProductRepository productRepository;




    public ProductService(ProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }
    public Product save(ProductSaveRequestDto dto){
        Product product=Product.builder()
                .price(dto.getPrice())
                .brand(dto.getBrand())
                .model(dto.getModel())
                .name(dto.getName())
                .build();
        return productRepository.save(product);
    }
    public Product saveMapper(ProductSaveRequestDto dto){
        Product product= ProductMapper.INSTANCE.toProduct(dto);
        product.setCreatedDate(System.currentTimeMillis());
        return productRepository.save(product);
    }
}
