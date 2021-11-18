package com.sushmita.github.dynamic_binding.basic.discountable.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sushmita.github.dynamic_binding.basic.discountable.Discountable;
import com.sushmita.github.dynamic_binding.basic.discountable.provider.DiscountableProvider;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Discountable.class).toProvider(DiscountableProvider.class);
    }
}
