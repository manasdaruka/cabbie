package com.manascabbie.cabbie.services;

import org.springframework.stereotype.Service;

import com.manascabbie.cabbie.models.Customer;
import com.manascabbie.cabbie.services.interfaces.ICustomerService;

@Service
public class CustomerService implements ICustomerService {

    @Override
    public String createCustomer(Customer customer)
    {
        return "cus123";
    }
    
}
