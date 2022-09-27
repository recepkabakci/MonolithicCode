package com.recepkabakci.MonolithicCode.controller;

import com.recepkabakci.MonolithicCode.repository.entity.Sale;
import com.recepkabakci.MonolithicCode.services.ProductService;
import com.recepkabakci.MonolithicCode.utility.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

}
