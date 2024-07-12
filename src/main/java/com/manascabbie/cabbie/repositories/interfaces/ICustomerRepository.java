package com.manascabbie.cabbie.repositories.interfaces;

import java.util.List;

import com.manascabbie.cabbie.models.Customer;

public interface ICustomerRepository {
     boolean saveCustomer(Customer customer);
     List<Customer> getAll();
}
