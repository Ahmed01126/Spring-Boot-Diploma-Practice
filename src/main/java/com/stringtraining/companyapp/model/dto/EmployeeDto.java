package com.stringtraining.companyapp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    String firstName;
    String lastName;
    String email;
    private AddressDto address;
}
