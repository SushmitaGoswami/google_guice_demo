package com.sushmita.github.dynamic_binding.lazy_initialization.discountable.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sushmita.github.dynamic_binding.lazy_initialization.discountable.Discountable;
import com.sushmita.github.dynamic_binding.lazy_initialization.discountable.provider.DiscountableProvider;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Discountable.class).toProvider(DiscountableProvider.class);
    }
}
