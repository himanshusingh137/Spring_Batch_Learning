package com.springboot.SpringBatch_learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringBatch_learning.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
