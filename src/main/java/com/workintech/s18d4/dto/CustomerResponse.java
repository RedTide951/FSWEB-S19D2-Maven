package com.workintech.s18d4.dto;

import com.workintech.s18d4.entity.Customer;

public record CustomerResponse(long id, String email, double salary) {
}
