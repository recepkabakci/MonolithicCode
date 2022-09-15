package com.recepkabakci.MonolithicCode.services;

import com.recepkabakci.MonolithicCode.repository.SellRepository;
import com.recepkabakci.MonolithicCode.repository.entity.Sell;
import org.springframework.stereotype.Service;


@Service
public class SellService extends ServiceManager<Sell,Long>{

    private final SellRepository sellRepository;


    public SellService(SellRepository sellRepository) {
        super(sellRepository);
        this.sellRepository = sellRepository;
    }
}
