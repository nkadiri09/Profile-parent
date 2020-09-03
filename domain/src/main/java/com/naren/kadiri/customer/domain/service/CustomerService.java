package com.naren.kadiri.customer.domain.service;

import com.naren.kadiri.customer.domain.aggregate.Customer;

public interface CustomerService {

    public Customer getCustomerById(Integer customerId);

}