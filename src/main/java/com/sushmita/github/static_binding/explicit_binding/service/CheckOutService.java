package com.sushmita.github.static_binding.explicit_binding.service;

import com.google.inject.Inject;
import com.sushmita.github.static_binding.explicit_binding.discountable.Discountable;

public class CheckOutService {

    @Inject
    private Discountable discountable;

    public void printReceipt(int price){
        System.out.println(price - discountable.getDiscount());
    }
}
