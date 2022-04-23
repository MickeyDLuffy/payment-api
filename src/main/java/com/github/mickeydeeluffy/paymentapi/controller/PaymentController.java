package com.github.mickeydeeluffy.paymentapi.controller;

import com.github.mickeydeeluffy.paymentapi.entity.Payment;
import com.github.mickeydeeluffy.paymentapi.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> pay(@RequestBody Payment payment, UriComponentsBuilder b) {
        URI uri = b.path("/api/payment/")
                .build()
                .toUri();
        return ResponseEntity.
                created(uri)
                .body(paymentService.pay(payment));
    }

    @GetMapping
    public ResponseEntity<List<Payment>> getPayments() {
        return ResponseEntity.ok(paymentService.getPayments());
    }
}
