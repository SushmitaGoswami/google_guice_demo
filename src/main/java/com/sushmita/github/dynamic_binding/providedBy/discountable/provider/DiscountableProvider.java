package com.sushmita.github.dynamic_binding.providedBy.discountable.provider;

import com.google.inject.Provider;
import com.sushmita.github.dynamic_binding.providedBy.discountable.Discountable;
import com.sushmita.github.dynamic_binding.providedBy.discountable.EarlyBirdDiscount;
import com.sushmita.github.dynamic_binding.providedBy.discountable.NightOwlDiscount;
import com.sushmita.github.dynamic_binding.providedBy.discountable.NoDiscount;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class DiscountableProvider implements Provider<Discountable> {
    public Discountable get() {
        return getDiscount();
    }

    private Discountable getDiscount(){
        Calendar calendar = new GregorianCalendar();
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        if(hours >=0 & hours <= 5){
            return new NightOwlDiscount();
        }else if(hours >=6 && hours <=10){
            return new EarlyBirdDiscount();
        }else{
            return new NoDiscount();
        }
    }

}
