package com.recepkabakci.MonolithicCode.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblcustomer")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data


public class Customer {
    @Id
    @SequenceGenerator(name = "sq_tblcustomer_id",
            sequenceName ="sq_tblcustomer_id", allocationSize = 1,initialValue = 100)
    @GeneratedValue(generator = "sq_tblcustomer_id")
    Long id;
    String firstName;
    String lastName;
    String address;
    String phone;
    String email;
    /**
     * 0->passive
     * 1->active
     * 2->deleted
     * 3->bloke
     */
    int state;
    Long createdDate;
    Long updatedDate;
}
