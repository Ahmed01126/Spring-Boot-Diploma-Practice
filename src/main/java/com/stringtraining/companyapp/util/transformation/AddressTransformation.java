package com.stringtraining.companyapp.util.transformation;

import com.stringtraining.companyapp.model.dto.AddressDto;
import com.stringtraining.companyapp.model.entity.Address;

import java.util.UUID;

public class AddressTransformation {

    private AddressTransformation(){

    }

    public static Address toAddress(AddressDto AddressDto) {
        return Address.builder()
                    .id(UUID.randomUUID())
                    .apartmentNumber(AddressDto.getApartmentNumber())
                    .buildingNumber(AddressDto.getBuildingNumber())
                    .street(AddressDto.getStreet())
                    .city(AddressDto.getCity())
                    .state(AddressDto.getState())
                    .build();
    }

    public static AddressDto toAddressDto(Address Address) {
        return AddressDto.builder()
                .apartmentNumber(Address.getApartmentNumber())
                .buildingNumber(Address.getBuildingNumber())
                .street(Address.getStreet())
                .city(Address.getCity())
                .state(Address.getState())
                .build();
    }
}
