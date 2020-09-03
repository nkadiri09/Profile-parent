package com.naren.kadiri.customer.domain.aggregate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private Integer customerId;
    private String customerName;

}