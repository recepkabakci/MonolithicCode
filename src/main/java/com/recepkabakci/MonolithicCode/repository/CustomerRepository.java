package com.recepkabakci.MonolithicCode.repository;

import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
