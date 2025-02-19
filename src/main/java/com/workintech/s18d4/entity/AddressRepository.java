package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AddressRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private int no;
    private String city;
    private String country;
    private String description;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true)
    private CustomerRepository customer;
}