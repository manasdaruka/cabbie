package com.manascabbie.cabbie.models.dtos;

import com.manascabbie.cabbie.models.Customer;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CustomerCreationDto {
    
    @NotBlank
    private String customerName;
    
    @NotNull
    private long phoneNo;

    @NotBlank
    private String emailId;

    @NotBlank
    private String password;

    public Customer getCustomer()
    {
        return new Customer()
            .setCustomerName(this.customerName)
            .setEmailId(emailId)
            .setPassword(password)
            .setPhoneNo(phoneNo);
    }
}
