package com.sushmita.github.dynamic_binding.lazy_initialization.discountable;

public class NoDiscount implements Discountable {

    public int getDiscount() {
        return 0;
    }
}
