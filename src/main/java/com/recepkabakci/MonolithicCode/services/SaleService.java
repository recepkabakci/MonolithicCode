package com.recepkabakci.MonolithicCode.services;

import com.recepkabakci.MonolithicCode.dto.request.FindByIdRequestDto;
import com.recepkabakci.MonolithicCode.dto.response.GetAllSaleResponseDto;
import com.recepkabakci.MonolithicCode.repository.CustomerRepository;
import com.recepkabakci.MonolithicCode.repository.ProductRepository;
import com.recepkabakci.MonolithicCode.repository.SaleRepository;
import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import com.recepkabakci.MonolithicCode.repository.entity.Product;
import com.recepkabakci.MonolithicCode.repository.entity.Sale;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class SaleService extends ServiceManager<Sale,Long>{

    private final SaleRepository saleRepository;
    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;


    public SaleService(SaleRepository saleRepository,ProductRepository productRepository,CustomerRepository customerRepository) {
        super(saleRepository);
        this.saleRepository = saleRepository;
        this.productRepository=productRepository;
        this.customerRepository= customerRepository;
    }
    public Optional<Sale> findById(FindByIdRequestDto dto){
        if(dto.getId()!=null) {
            return saleRepository.findById(dto.getId());
        }
        return Optional.empty();
    }
    public List<GetAllSaleResponseDto> findAllDto(){
        List<Sale> saleList= saleRepository.findAll();

        List<GetAllSaleResponseDto> responseDtoList=new ArrayList<>();

        saleList.forEach(x->{
            Optional<Customer>customer= customerRepository.findById(x.getCustomerId());
            Optional<Product>product = productRepository.findById(x.getProductId());
            if(customer.isPresent() && product.isPresent()){

            responseDtoList.add(GetAllSaleResponseDto.builder()
                    .id(x.getId())
                    .number(x.getNumber())
                    .price(x.getPrice())
                    .totalAmount(x.getPrice()*x.getNumber())
                    .createdDate(
                            Instant.ofEpochMilli(x.getCreatedDate())
                                .atZone(java.time.ZoneId.systemDefault())
                                .toLocalDate()
                    )
                                    .productName(product.get().getName())
                                    .customerName(customer.get().getFirstName())

                    .build());
            }else{
               System.out.println("Customer or product could not find...:[Sale id]"+x.getId());
            }
        });
        return responseDtoList;

    }
}
