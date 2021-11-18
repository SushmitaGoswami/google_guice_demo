package com.sushmita.github.static_binding.implemented_by.discountable;

public class NoDiscount implements Discountable {

    public int getDiscount() {
        return 0;
    }
}
