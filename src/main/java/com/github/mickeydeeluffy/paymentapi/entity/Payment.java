package com.github.mickeydeeluffy.paymentapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue
    private int id;

    private String status;
    private String transactionId;
}
