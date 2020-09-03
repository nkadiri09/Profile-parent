package com.naren.kadiri.customer.domain.repository;

import com.naren.kadiri.customer.domain.aggregate.Customer;

public interface CustomerRepository {
    public Customer getCustomerById(Integer customerId);
}