package com.sushmita.github.static_binding.explicit_binding.discountable;

public class NoDiscount implements Discountable{

    public int getDiscount() {
        return 0;
    }
}
