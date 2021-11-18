package com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {
        //binder.bind(Discountable.class).toProvider(DiscountableProvider.class);
    }
}
