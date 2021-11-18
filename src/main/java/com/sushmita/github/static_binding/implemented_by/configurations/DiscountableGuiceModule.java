package com.sushmita.github.static_binding.implemented_by.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sushmita.github.static_binding.implemented_by.discountable.Discountable;
import com.sushmita.github.static_binding.implemented_by.discountable.EarlyBirdDiscount;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {

    }
}
