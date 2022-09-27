package com.recepkabakci.MonolithicCode.controller;

import com.recepkabakci.MonolithicCode.dto.request.ProductSaveRequestDto;
import com.recepkabakci.MonolithicCode.repository.entity.Product;
import com.recepkabakci.MonolithicCode.repository.entity.Sale;
import com.recepkabakci.MonolithicCode.services.ProductService;
import com.recepkabakci.MonolithicCode.utility.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/savealldemo")
    public ResponseEntity<String> saveAllDemo(){
        productService.saveAll(new Datas().getProductList());
        return ResponseEntity.ok("Product Succesfull");
    }
    @PostMapping("/saveparam")
    public ResponseEntity<Product>  saveDto(ProductSaveRequestDto dto){
        Product product=Product.builder()
                .price(dto.getPrice())
                .brand(dto.getBrand())
                .model(dto.getModel())
                .name(dto.getName())
                .build();
        return ResponseEntity.ok(productService.save(product));
    }
    @PostMapping("/saveparamdto")
    public ResponseEntity<Product> saveParamDto(ProductSaveRequestDto dto){
        return ResponseEntity.ok(productService.saveMapper(dto));
    }

}
