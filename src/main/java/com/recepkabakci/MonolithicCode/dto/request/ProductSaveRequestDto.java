package com.recepkabakci.MonolithicCode.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ProductSaveRequestDto {
    String name;
    String brand;
    String model;
    Double price;
}
