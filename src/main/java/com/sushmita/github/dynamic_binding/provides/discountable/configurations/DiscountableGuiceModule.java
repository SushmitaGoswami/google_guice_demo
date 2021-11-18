package com.sushmita.github.dynamic_binding.provides.discountable.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.sushmita.github.dynamic_binding.provides.discountable.Discountable;
import com.sushmita.github.dynamic_binding.provides.discountable.EarlyBirdDiscount;
import com.sushmita.github.dynamic_binding.provides.discountable.NightOwlDiscount;
import com.sushmita.github.dynamic_binding.provides.discountable.NoDiscount;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {

    }

    @Provides
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
