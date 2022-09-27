package com.recepkabakci.MonolithicCode.repository;

import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByAddress(String address);
    List<Customer> findAllByFirstNameLike(String firstName);
    List<Customer> findAllByCreatedDateGreaterThan(Long createdDate);


    Optional<Customer> findOptionalByFirstName(String firstName);
}
