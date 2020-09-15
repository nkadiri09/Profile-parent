package com.naren.kadiri.customer.service.implementation;

import com.naren.kadiri.customer.domain.aggregate.Customer;
import com.naren.kadiri.customer.domain.repository.CustomerRepository;
import com.naren.kadiri.customer.domain.service.CustomerService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer getCustomerById(Integer customerId) {
        log.info("Inside CustomerServiceImpl........");
        Customer customer = customerRepository.getCustomerById(customerId);
        return customer;
    }
}