package com.sushmita.github.dynamic_binding.providedBy.discountable;

import com.google.inject.ProvidedBy;
import com.sushmita.github.dynamic_binding.providedBy.discountable.provider.DiscountableProvider;

@ProvidedBy(DiscountableProvider.class)
public interface Discountable {
    int getDiscount();
}
