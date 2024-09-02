package com.stringtraining.companyapp.controller;

import com.stringtraining.companyapp.model.dto.AddressDto;
import com.stringtraining.companyapp.service.IAddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/address")
public class AddressController {
    private final IAddressService addressService;

    @Autowired
    public AddressController(IAddressService addressService){
        this.addressService = addressService;
    }

    @PostMapping("saveAddress")
    public void saveAddressApi(@RequestBody AddressDto addressDto) {
        addressService.save(addressDto);
    }

    @PutMapping("updateAddressById/{id}")
    public void updateAddressApi(@PathVariable UUID id, @RequestBody AddressDto newAddressDto) {
        addressService.update(id, newAddressDto);
    }

    @DeleteMapping("deleteAddressById/{id}")
    public void deleteAddressApi(@PathVariable UUID id) {
        addressService.delete(id);
    }

    @GetMapping("findAddressById/{id}")
    public AddressDto findAddressByIdApi(@PathVariable UUID id){
        return addressService.findById(id);
    }

    @GetMapping("findAllAddresses")
    List<AddressDto> findAllAddressesApi(){
        return addressService.findAll();
    }
}
