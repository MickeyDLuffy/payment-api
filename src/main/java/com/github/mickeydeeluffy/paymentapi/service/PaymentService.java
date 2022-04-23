package com.github.mickeydeeluffy.paymentapi.service;

import com.github.mickeydeeluffy.paymentapi.dto.Order;
import com.github.mickeydeeluffy.paymentapi.entity.Payment;
import com.github.mickeydeeluffy.paymentapi.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PaymentService {
    private final PaymentRepository paymentRepository;
    private final RestTemplate restTemplate;
    public Payment pay(Payment payment) {
        return this.paymentRepository.save(payment);
    }

    public List<Payment> getPayments() {
        getOrders().forEach(System.out::println);
        return this.paymentRepository.findAll();
    }

    public List<Order> getOrders() {
      return Arrays.stream(restTemplate.getForEntity("http://order-api/api/order", Order[].class).getBody()).toList();
    }
}
