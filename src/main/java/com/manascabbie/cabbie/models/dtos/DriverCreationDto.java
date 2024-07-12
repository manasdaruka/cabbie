package com.manascabbie.cabbie.models.dtos;

import com.manascabbie.cabbie.models.Driver;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DriverCreationDto {
    
    @NotBlank
    private String driverName;
    
    @NotNull
    private long phoneNo;

    @NotBlank
    private String emailId;

    @NotBlank
    private String password;

    public Driver getDriver()
    {
        return new Driver()
            .setDriverName(this.driverName)
            .setEmailId(emailId)
            .setPassword(password)
            .setPhoneNo(phoneNo);
    }
}
