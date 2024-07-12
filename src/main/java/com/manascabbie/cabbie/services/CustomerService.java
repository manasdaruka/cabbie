package com.manascabbie.cabbie.services;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.manascabbie.cabbie.models.Customer;
import com.manascabbie.cabbie.repositories.CustomerRespository;
import com.manascabbie.cabbie.services.interfaces.ICustomerService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService implements ICustomerService {

    private CustomerRespository customerRespository;

    @Override
    public String createCustomer(Customer customer) throws Exception
    {
        customer.setCustomerId("cus"+UUID.randomUUID());
        customer.setCreatedAt(Instant.now());
        if(!customerRespository.saveCustomer(customer)) {
            throw new Exception("unable to save customer at the moment");
        }
        return customer.getCustomerId();
    }
    
}
