package com.manascabbie.cabbie.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manascabbie.cabbie.models.dtos.CustomerCreationDto;
import com.manascabbie.cabbie.services.interfaces.ICustomerService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import java.util.Collections;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private ICustomerService customerService;
    
    @PostMapping("signup")
    public ResponseEntity<Map<String,String>> createCustomer(@Valid @RequestBody CustomerCreationDto createCustomerReq) {
        try {
            String customerId = customerService.createCustomer(createCustomerReq.getCustomer());
            return new ResponseEntity<>(Collections.singletonMap("customerId", customerId), HttpStatus.OK);
        }
        catch(Exception e) {
            return new ResponseEntity<>(Collections.singletonMap("error", "Cannot save customer\n"+e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
