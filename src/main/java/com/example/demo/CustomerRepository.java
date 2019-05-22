package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
    Iterable<Customer>findByid(Long id);
    Iterable<Customer> findByLastName(String lastName);
}
