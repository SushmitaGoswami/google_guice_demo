package com.sushmita.github.dynamic_binding.provides;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sushmita.github.dynamic_binding.provides.discountable.configurations.DiscountableGuiceModule;
import com.sushmita.github.dynamic_binding.provides.service.CheckOutService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountableGuiceModule());
        CheckOutService service = injector.getInstance(CheckOutService.class);
        service.printReceipt(100);
    }
}
