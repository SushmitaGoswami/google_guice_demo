package com.sushmita.github.dynamic_binding.map_binder.discountable.provider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sushmita.github.dynamic_binding.map_binder.discountable.Discountable;
import com.sushmita.github.dynamic_binding.map_binder.discountable.EarlyBirdDiscount;
import com.sushmita.github.dynamic_binding.map_binder.discountable.NightOwlDiscount;
import com.sushmita.github.dynamic_binding.map_binder.discountable.NoDiscount;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.Random;


public class DiscountableProvider implements Provider<Discountable> {

    private Map<Integer, Discountable> mapBinder;
    private Random random;

    @Inject
    public DiscountableProvider(Map<Integer, Discountable> mapBinder, Random random){
        this.mapBinder = mapBinder;
        this.random = random;
    }
    public Discountable get() {
     return this.mapBinder.get(random.nextInt(2));
    }

}
