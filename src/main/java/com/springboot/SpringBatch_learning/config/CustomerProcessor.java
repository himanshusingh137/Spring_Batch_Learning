package com.springboot.SpringBatch_learning.config;

import org.springframework.batch.item.ItemProcessor;

import com.springboot.SpringBatch_learning.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer) {
        int age = Integer.parseInt(customer.getAge());
        if (age >= 18) {
            return customer;
        }
        return null;
    }
}