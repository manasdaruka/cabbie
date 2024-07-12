package com.manascabbie.cabbie.models;

import java.time.Instant;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Driver {
    private String driverId;
    private String driverName;
    private long phoneNo;
    private String emailId;
    private String password;
    private Instant createdAt; 
}
