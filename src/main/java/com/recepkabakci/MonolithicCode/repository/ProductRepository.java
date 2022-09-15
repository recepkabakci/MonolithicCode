package com.recepkabakci.MonolithicCode.repository;

import com.recepkabakci.MonolithicCode.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
