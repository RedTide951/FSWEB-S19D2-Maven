package com.workintech.s18d4.dao;

public record AccountResponse(Long id, String accountName, double moneyAmount, CustomerReponse customerReponse) {
}
