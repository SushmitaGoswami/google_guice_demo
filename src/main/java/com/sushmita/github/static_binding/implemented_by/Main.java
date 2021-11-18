package com.sushmita.github.static_binding.implemented_by;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.sushmita.github.static_binding.implemented_by.configurations.DiscountableGuiceModule;
import com.sushmita.github.static_binding.implemented_by.service.CheckOutService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountableGuiceModule());
        CheckOutService service = injector.getInstance(CheckOutService.class);
        service.printReceipt(100);
    }
}
