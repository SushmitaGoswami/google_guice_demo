package com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.factory;

import com.google.inject.ImplementedBy;
import com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable.Discountable;

@ImplementedBy(DiscountFactoryImpl.class)
public interface DiscountFactory{
    Discountable getDiscount(int hours);
}
