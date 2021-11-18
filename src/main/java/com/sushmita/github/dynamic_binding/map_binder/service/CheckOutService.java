package com.sushmita.github.dynamic_binding.map_binder.service;

import com.google.inject.Inject;
import com.sushmita.github.dynamic_binding.map_binder.discountable.Discountable;

public class CheckOutService {

    @Inject
    private Discountable discountable;

    public void printReceipt(int price){
        System.out.println(price - discountable.getDiscount());
    }
}
