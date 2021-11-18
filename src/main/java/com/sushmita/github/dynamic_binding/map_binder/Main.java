package com.sushmita.github.dynamic_binding.map_binder;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sushmita.github.dynamic_binding.map_binder.discountable.configurations.DiscountableGuiceModule;
import com.sushmita.github.dynamic_binding.map_binder.service.CheckOutService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountableGuiceModule());
        CheckOutService service = injector.getInstance(CheckOutService.class);
        service.printReceipt(100);
    }
}
