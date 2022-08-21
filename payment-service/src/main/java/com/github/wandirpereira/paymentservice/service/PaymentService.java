package com.github.wandirpereira.paymentservice.service;

import com.github.wandirpereira.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
