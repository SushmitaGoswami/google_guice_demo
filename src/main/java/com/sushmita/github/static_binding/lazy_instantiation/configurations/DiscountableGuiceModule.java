package com.sushmita.github.static_binding.lazy_instantiation.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sushmita.github.static_binding.lazy_instantiation.discountable.Discountable;
import com.sushmita.github.static_binding.lazy_instantiation.discountable.EarlyBirdDiscount;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Discountable.class).to(EarlyBirdDiscount.class);

    }
}
