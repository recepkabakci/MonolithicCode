package com.recepkabakci.MonolithicCode;

import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import com.recepkabakci.MonolithicCode.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/save")
    public ResponseEntity<Customer> save(){
        Customer customer=Customer.builder()
                .firstName("Recep")
                .lastName("Kabakcı")
                .phone("5558476214")
                .address("Istanbul")
                .email("rcpkabakci3737@gmail.com")
                .build();
        customerService.save(customer);
        return ResponseEntity.ok(customer);
    }

}
