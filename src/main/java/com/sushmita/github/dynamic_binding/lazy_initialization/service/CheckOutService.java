package com.sushmita.github.dynamic_binding.lazy_initialization.service;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sushmita.github.dynamic_binding.lazy_initialization.discountable.Discountable;

public class CheckOutService {

    @Inject
    private Provider<Discountable> discountable;

    public void printReceipt(int price){
        System.out.println(price - discountable.get().getDiscount());
    }
}
