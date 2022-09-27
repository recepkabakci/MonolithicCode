package com.recepkabakci.MonolithicCode.controller;

import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import com.recepkabakci.MonolithicCode.services.CustomerService;
import com.recepkabakci.MonolithicCode.utility.Datas;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/saveall")
    public ResponseEntity<Void> saveAll(){
        try {
            customerService.saveAll(new Datas().getCustomerList());
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }
    @GetMapping("/getall")
    public  ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(customerService.findAll());
    }
    @GetMapping("/getallbyaddress")
    public ResponseEntity<List<Customer>> findAllByAddress(){
        String address= "Istanbul";
        return ResponseEntity.ok(customerService.findAllByAddress(address));
    }
    @GetMapping("/getallbyfirstnamelike")
    public ResponseEntity<List<Customer>> findAllByFirstNameLike(){
        String firstName= "%e%";
        return ResponseEntity.ok(customerService.findAllByFirstNameLike(firstName));
    }
    @GetMapping("/getAllbycreateddate")
    public ResponseEntity<List<Customer>> findAllByCreatedDateGreaterThan(){
       Long createdDate= 1663564381000L;
       return ResponseEntity.ok(customerService.findAllByCreatedDateGreaterThan(createdDate));
    }
    @GetMapping("/getallbyfirstname")
    public ResponseEntity<Object> findOptionalByFirstName(){
        String firstName="Recep ";
        Optional<Customer> customer = customerService.findOptionalByFirstName(firstName);
        if(customer.isPresent())
            return ResponseEntity.ok(customer.get());
        return ResponseEntity.badRequest().build();
    }
}
