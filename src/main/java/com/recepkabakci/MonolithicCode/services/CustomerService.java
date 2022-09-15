package com.recepkabakci.MonolithicCode.services;

import com.recepkabakci.MonolithicCode.repository.CustomerRepository;
import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import org.springframework.stereotype.Service;


@Service
public class CustomerService extends ServiceManager<Customer,Long> {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }
}
