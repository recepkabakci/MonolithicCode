package com.recepkabakci.MonolithicCode.controller;

import com.recepkabakci.MonolithicCode.dto.request.FindByIdRequestDto;
import com.recepkabakci.MonolithicCode.repository.entity.Sale;
import com.recepkabakci.MonolithicCode.services.SaleService;
import com.recepkabakci.MonolithicCode.utility.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("sale")
@RequiredArgsConstructor
public class SaleController {
    private final SaleService saleService;
    @GetMapping("/savealldemo")
    public ResponseEntity<String> saveAllDemo(){
        saleService.saveAll(new Datas().getSaleList());
        return ResponseEntity.ok("Sale Succesfull");
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Sale>> findAll(){
        return ResponseEntity.ok(saleService.findAll());

}
    @PostMapping("/findbyid")
    public ResponseEntity<Sale> findById(FindByIdRequestDto dto){
        Optional<Sale> sale = saleService.findById(dto);
        if(sale.isPresent()){
            return ResponseEntity.ok(sale.get());
        }
        return ResponseEntity.ok(new Sale());
    }

}
