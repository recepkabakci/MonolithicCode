package com.recepkabakci.MonolithicCode.services;

import com.recepkabakci.MonolithicCode.dto.request.FindByIdRequestDto;
import com.recepkabakci.MonolithicCode.dto.response.GetAllSaleResponseDto;
import com.recepkabakci.MonolithicCode.repository.SaleRepository;
import com.recepkabakci.MonolithicCode.repository.entity.Sale;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SaleService extends ServiceManager<Sale,Long>{

    private final SaleRepository saleRepository;


    public SaleService(SaleRepository saleRepository) {
        super(saleRepository);
        this.saleRepository = saleRepository;
    }
    public Optional<Sale> findById(FindByIdRequestDto dto){
        if(dto.getId()!=null) {
            return saleRepository.findById(dto.getId());
        }
        return Optional.empty();
    }
    public List<GetAllSaleResponseDto> findAllDto(){

    }
}
