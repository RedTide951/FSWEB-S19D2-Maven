package com.workintech.s18d4.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AccountRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountName;
    private double moneyAmount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerRepository customer;
}