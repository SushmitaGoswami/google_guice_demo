package com.sushmita.github.dynamic_binding.map_binder.discountable.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.multibindings.MapBinder;
import com.sushmita.github.dynamic_binding.map_binder.discountable.Discountable;
import com.sushmita.github.dynamic_binding.map_binder.discountable.EarlyBirdDiscount;
import com.sushmita.github.dynamic_binding.map_binder.discountable.NightOwlDiscount;
import com.sushmita.github.dynamic_binding.map_binder.discountable.NoDiscount;
import com.sushmita.github.dynamic_binding.map_binder.discountable.provider.DiscountableProvider;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {
        MapBinder<Integer, Discountable> integerDiscountableMapBinder = MapBinder.newMapBinder(binder,
                Integer.class, Discountable.class);

        integerDiscountableMapBinder.addBinding(0).to(EarlyBirdDiscount.class);
        integerDiscountableMapBinder.addBinding(1).to(NightOwlDiscount.class);
        integerDiscountableMapBinder.addBinding(2).to(NoDiscount.class);

        binder.bind(Discountable.class).toProvider(DiscountableProvider.class);
    }
}
