package com.sushmita.github.static_binding.lazy_instantiation.service;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sushmita.github.static_binding.lazy_instantiation.discountable.Discountable;

public class CheckOutService {

    @Inject
    private Provider<Discountable> discountable;

    public void printReceipt(int price){
        System.out.println(price - discountable.get().getDiscount());
    }
}
