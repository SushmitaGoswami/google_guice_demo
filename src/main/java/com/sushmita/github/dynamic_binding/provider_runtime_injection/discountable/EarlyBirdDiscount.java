package com.sushmita.github.dynamic_binding.provider_runtime_injection.discountable;

public class EarlyBirdDiscount implements Discountable {

    public int getDiscount() {
        return 25;
    }
}
