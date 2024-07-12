package com.manascabbie.cabbie.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.manascabbie.cabbie.models.Customer;
import com.manascabbie.cabbie.repositories.interfaces.ICustomerRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class CustomerRespository implements ICustomerRepository{

    private HashMap<String, Customer> customerStore;

    @Override
    public boolean saveCustomer(Customer customer) {
        return customerStore.putIfAbsent(customer.getCustomerId(), customer) == null;
    }

    @Override
    public List<Customer> getAll() {
        return customerStore.values().stream().collect(Collectors.toList());
    }
}