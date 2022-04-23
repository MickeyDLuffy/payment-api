package com.github.mickeydeeluffy.paymentapi.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Jacksonized
@Builder(toBuilder = true)
public class Order {

    private int id;

    private String name;
    private int quantity;
    private double price;
}
