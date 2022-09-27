package com.recepkabakci.MonolithicCode.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class GetAllSaleResponseDto {
    private  Long id;
    private String customerId;
    private String productId;
    private int number;
    private Double price;
    private Double totalAmount;
    private LocalDate createdDate;

}
