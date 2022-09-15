package com.recepkabakci.MonolithicCode.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblsell")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sell {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    Long customerId;
    Long productId;
    int number;
    Double price;
    int state;
    Long createdDate;
    Long updatedDate;
}
