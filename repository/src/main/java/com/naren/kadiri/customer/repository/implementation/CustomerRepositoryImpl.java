package com.naren.kadiri.customer.repository.implementation;

import com.naren.kadiri.customer.domain.aggregate.Customer;
import com.naren.kadiri.customer.domain.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public Customer getCustomerById(Integer customerId) {
        log.info("Inside CustomerRepositoryImpl........");
        // Replace this code to retrieve from database

        Customer customer = new Customer(100, "A New Customer");
        return customer;
    }
}