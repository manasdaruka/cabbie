package com.manascabbie.cabbie.repositories.interfaces;

import java.util.List;

import com.manascabbie.cabbie.models.Driver;

public interface IDriverRepository {
    boolean saveDriver(Driver driver);
    List<Driver> getAll();

}
