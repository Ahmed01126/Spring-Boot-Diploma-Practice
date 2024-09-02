package com.stringtraining.companyapp.service;

import com.stringtraining.companyapp.model.dto.AddressDto;

import java.util.List;
import java.util.UUID;

public interface IAddressService {

    void save(AddressDto addressDto);

    void update(UUID id,AddressDto newAddressDto);

    void delete(UUID id);

    AddressDto findById(UUID id);

    List<AddressDto> findAll();
}
