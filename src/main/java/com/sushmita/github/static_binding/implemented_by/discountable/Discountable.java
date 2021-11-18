package com.sushmita.github.static_binding.implemented_by.discountable;

import com.google.inject.ImplementedBy;

@ImplementedBy(NightOwlDiscount.class)
public interface Discountable {
    int getDiscount();
}
