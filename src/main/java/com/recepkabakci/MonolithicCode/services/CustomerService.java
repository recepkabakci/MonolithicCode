package com.recepkabakci.MonolithicCode.services;

import com.recepkabakci.MonolithicCode.repository.CustomerRepository;
import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService extends ServiceManager<Customer,Long> {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }


    public List<Customer> findAllByAddress(String address){

        return customerRepository.findAllByAddress(address);
    }
    public List<Customer> findAllByFirstNameLike(String firstName){
        return customerRepository.findAllByFirstNameLike(firstName);
    }
    public List<Customer> findAllByCreatedDateGreaterThan(Long createdDate){
       return customerRepository.findAllByCreatedDateGreaterThan(createdDate);
    }
    public Optional<Customer> findOptionalByFirstName(String firstName){
        return  customerRepository.findOptionalByFirstName(firstName);
    }
}
