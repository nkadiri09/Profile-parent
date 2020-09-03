package com.naren.kadiri.customer.repository.implementation;

import com.naren.kadiri.customer.domain.aggregate.Customer;
import com.naren.kadiri.customer.domain.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    private static final Logger logger = LoggerFactory.getLogger(CustomerRepositoryImpl.class);

    @Override
    public Customer getCustomerById(Integer customerId) {
        logger.info("Inside CustomerRepositoryImpl........");
        // Replace this code to retrieve from database

        Customer customer = new Customer(100, "A New Customer");
        return customer;
    }
}