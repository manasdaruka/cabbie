package com.manascabbie.cabbie.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manascabbie.cabbie.models.dtos.DriverCreationDto;
import com.manascabbie.cabbie.services.interfaces.IDriverService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/driver")
@AllArgsConstructor
public class DriverController {

    private IDriverService driverService;
    
    @PostMapping("signup")
    public ResponseEntity<Map<String, String>> createDriver(@Valid @RequestBody DriverCreationDto createDriverReq) {
        try {
            String driverId = driverService.creatDriver(createDriverReq.getDriver());
            return new ResponseEntity<>(Collections.singletonMap("driverId", driverId), HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<>(Collections.singletonMap("error", "Cannot save customer\n"+e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
