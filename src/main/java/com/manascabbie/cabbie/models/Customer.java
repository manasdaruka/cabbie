package com.manascabbie.cabbie.models;

import java.time.Instant;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Customer {
    private String customerId;
    private String customerName;
    private long phoneNo;
    private String emailId;
    private String password;
    private Instant createdAt; 
}
