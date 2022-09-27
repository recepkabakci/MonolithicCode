package com.recepkabakci.MonolithicCode.utility;

import com.recepkabakci.MonolithicCode.repository.entity.Customer;
import com.recepkabakci.MonolithicCode.repository.entity.Product;
import com.recepkabakci.MonolithicCode.repository.entity.Sale;

import java.util.ArrayList;
import java.util.List;

public class Datas {
    private List<Customer> customerList;

    public List<Customer> getCustomerList(){
        customerList = new ArrayList<>();
        customerList.add(Customer.builder()
                .firstName("Recep")
                .lastName("Kabakcı")
                .phone("5558476214")
                .address("Istanbul")
                .createdDate(1663582381000l)
                .email("rcpkabakci3737@gmail.com").build());
        customerList.add(Customer.builder()
                .firstName("Berhiv")
                .lastName("Kabakcı")
                .phone("5436787922")
                .address("Ankara")
                .createdDate(1663672381000l)
                .email("iba040@gmail.com").build());
        customerList.add(Customer.builder()
                .firstName("Ibo")
                .lastName("Bas")
                .phone("5380901324")
                .address("Kayseri")
                .createdDate(1663153981000l)
                .email("ibobas7@gmail.com").build());
        customerList.add(Customer.builder()
                .firstName("Aydın")
                .lastName("Ay")
                .phone("5345680180")
                .address("Kastamonu")
                .createdDate(1663409581000l)
                .email("aydınay@gmail.com").build());
        return customerList;
    }

    private List<Product> productList;

    public List<Product> getProductList(){
        productList = new ArrayList<>();
        productList.add(Product.builder()
                .name("Computer")
                .price(2000.0)
                .brand("Asus")
                .model("K555U")
                .stoke(19)
                .state(1)
                .createdDate(1663582381000l)
                .build());
        productList.add(Product.builder()
                .name("Computer")
                .price(3000.0)
                .brand("Lenovo")
                .model("62xyz")
                .stoke(3)
                .state(1)
                .createdDate(1664562381000l)
                .build());
        productList.add(Product.builder()
                .name("Computer")
                .price(1000.0)
                .brand("HP")
                .model("Pro3")
                .stoke(9)
                .state(1)
                .createdDate(1654322381000l)
                .build());
        return productList;
    }
    private List<Sale> saleList;

    public List<Sale> getSaleList(){
        saleList= new ArrayList<>();
        saleList.add(Sale.builder()
                .number(1)
                .price(1000.0)
                .customerId(101L)
                .productId(1L)
                .state(1)
                .createdDate(1663582381000l)
                .build());
        saleList.add(Sale.builder()
                .number(1)
                .price(3000.0)
                .customerId(102L)
                .productId(2L)
                .state(1)
                .createdDate(1663582381000l)
                .build());
        saleList.add(Sale.builder()
                .number(1)
                .price(2000.0)
                .customerId(103L)
                .productId(3L)
                .state(1)
                .createdDate(1663582381000l)
                .build());
        return saleList;
    }
}
