package com.manascabbie.cabbie.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.manascabbie.cabbie.models.Driver;
import com.manascabbie.cabbie.repositories.interfaces.IDriverRepository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class DriverRepository implements IDriverRepository {
        private HashMap<String, Driver> driverStore;

    @Override
    public boolean saveDriver(Driver driver) {
        return driverStore.putIfAbsent(driver.getDriverId(), driver) == null;
    }

    @Override
    public List<Driver> getAll() {
        return driverStore.values().stream().collect(Collectors.toList());
    }
}
