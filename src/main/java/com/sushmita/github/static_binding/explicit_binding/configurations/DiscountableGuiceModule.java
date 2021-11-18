package com.sushmita.github.static_binding.explicit_binding.configurations;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.sushmita.github.static_binding.explicit_binding.discountable.Discountable;
import com.sushmita.github.static_binding.explicit_binding.discountable.EarlyBirdDiscount;

public class DiscountableGuiceModule implements Module {
    public void configure(Binder binder) {
        binder.bind(Discountable.class).to(EarlyBirdDiscount.class);

    }
}
