package com.recepkabakci.MonolithicCode.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblsale")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Sale {
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
