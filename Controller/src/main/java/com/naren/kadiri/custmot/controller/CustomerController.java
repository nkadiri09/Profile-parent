package com.naren.kadiri.custmot.controller;

import com.naren.kadiri.customer.domain.aggregate.Customer;
import com.naren.kadiri.customer.domain.service.CustomerService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("customer/{customerId}")
	public Customer getCustomer(@PathVariable Integer customerId) {

		log.info("Inside CustomerController........");
		return customerService.getCustomerById(customerId);
	}
}