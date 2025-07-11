package com.smartcoder.PaymentService.service;

import com.smartcoder.PaymentService.model.PaymentRequest;
import com.smartcoder.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(Long orderId);
}
