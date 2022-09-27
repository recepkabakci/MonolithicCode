package com.recepkabakci.MonolithicCode.mapper;
import com.recepkabakci.MonolithicCode.dto.request.ProductSaveRequestDto;
import com.recepkabakci.MonolithicCode.repository.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product toProduct(ProductSaveRequestDto dto);
}
