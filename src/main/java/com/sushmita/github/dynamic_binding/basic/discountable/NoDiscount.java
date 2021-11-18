package com.sushmita.github.dynamic_binding.basic.discountable;

public class NoDiscount implements Discountable {

    public int getDiscount() {
        return 0;
    }
}
