package com.sushmita.github.static_binding.lazy_instantiation.discountable;

public class NoDiscount implements Discountable {

    public int getDiscount() {
        return 0;
    }
}
