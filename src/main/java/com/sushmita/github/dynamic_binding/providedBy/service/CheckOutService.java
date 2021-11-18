package com.sushmita.github.dynamic_binding.providedBy.service;

import com.google.inject.Inject;
import com.sushmita.github.dynamic_binding.providedBy.discountable.Discountable;

public class CheckOutService {

    @Inject
    private Discountable discountable;

    public void printReceipt(int price){
        System.out.println(price - discountable.getDiscount());
    }
}
