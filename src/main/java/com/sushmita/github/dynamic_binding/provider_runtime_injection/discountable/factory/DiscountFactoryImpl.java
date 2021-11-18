package com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.factory;

import com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.Discountable;
import com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.EarlyBirdDiscount;
import com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.NightOwlDiscount;
import com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.NoDiscount;


public class DiscountFactoryImpl implements DiscountFactory{
    public Discountable getDiscount(int hours) {
        if(hours >=0 & hours <= 5){
            return new NightOwlDiscount();
        }else if(hours >=6 && hours <=10){
            return new EarlyBirdDiscount();
        }else{
            return new NoDiscount();
        }
    }
}
