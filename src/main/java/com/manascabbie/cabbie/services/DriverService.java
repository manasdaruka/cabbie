package com.manascabbie.cabbie.services;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.manascabbie.cabbie.models.Customer;
import com.manascabbie.cabbie.models.Driver;
import com.manascabbie.cabbie.repositories.interfaces.IDriverRepository;
import com.manascabbie.cabbie.services.interfaces.IDriverService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DriverService implements IDriverService {

    private IDriverRepository driverRepository;
    @Override
    public String creatDriver(Driver driver) throws Exception {
        driver.setDriverId("dri"+UUID.randomUUID());
        driver.setCreatedAt(Instant.now());
        if(!driverRepository.saveDriver(driver)) {
            throw new Exception("unable to save driver at the moment");
        }
        return driver.getDriverId();
    }
    
}
