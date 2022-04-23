package com.github.mickeydeeluffy.paymentapi.repository;

import com.github.mickeydeeluffy.paymentapi.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
