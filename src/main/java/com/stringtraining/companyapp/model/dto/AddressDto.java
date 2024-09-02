package com.stringtraining.companyapp.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDto {
    private int apartmentNumber;
    private int buildingNumber;
    private String street;
    private String city;
    private String state;

}
