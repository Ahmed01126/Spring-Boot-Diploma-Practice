package com.stringtraining.companyapp.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Address")
public class Address {
    @Id
    @Column(nullable = false)
    private UUID id;

    @Column(name = "apartment_number", nullable = false)
    private int apartmentNumber;

    @Column(name = "building_number", nullable = false)
    private int buildingNumber;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @OneToMany(mappedBy = "address")
    private List<Employee> employees;

}
