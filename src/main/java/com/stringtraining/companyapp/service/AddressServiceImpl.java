package com.stringtraining.companyapp.service;

import com.stringtraining.companyapp.dao.employee.IAddressRepo;
import com.stringtraining.companyapp.model.dto.AddressDto;
import com.stringtraining.companyapp.util.transformation.AddressTransformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AddressServiceImpl implements IAddressService {
    private final IAddressRepo addressRepo;

    @Autowired
    public AddressServiceImpl(IAddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @Override
    public void save(AddressDto addressDto) {
        addressRepo.save(AddressTransformation.toAddress(addressDto));
    }

    @Override
    public void update(UUID id, AddressDto newAddressDto) {

    }

    @Override
    public void delete(UUID id) {

    }

    @Override
    public AddressDto findById(UUID id) {
        return null;
    }

    @Override
    public List<AddressDto> findAll() {
        return List.of();
    }
}
