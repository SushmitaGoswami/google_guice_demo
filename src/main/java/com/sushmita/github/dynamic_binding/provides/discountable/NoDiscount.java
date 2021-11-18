package com.sushmita.github.dynamic_binding.provides.discountable;

public class NoDiscount implements Discountable {

    public int getDiscount() {
        return 0;
    }
}
