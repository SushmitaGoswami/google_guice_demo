package com.sushmita.github.dynamic_binding.provider_runtime_injection.service;

import com.google.inject.Inject;
import com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.Discountable;
import com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.factory.DiscountFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CheckOutService {

    @Inject
    private DiscountFactory discountFactory;

    public void printReceipt(int price){
        Calendar calendar = new GregorianCalendar();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(price - discountFactory.getDiscount
                                            (hours).getDiscount());
    }
}
