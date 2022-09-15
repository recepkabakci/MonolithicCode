package com.recepkabakci.MonolithicCode.repository;

import com.recepkabakci.MonolithicCode.repository.entity.Sell;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellRepository extends JpaRepository<Sell,Long> {
}
