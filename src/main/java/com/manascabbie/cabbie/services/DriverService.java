package com.manascabbie.cabbie.services;

import org.springframework.stereotype.Service;

import com.manascabbie.cabbie.models.Driver;
import com.manascabbie.cabbie.services.interfaces.IDriverService;

@Service
public class DriverService implements IDriverService {

    @Override
    public String creatDriver(Driver driver) {
        return "123";
    }
    
}
