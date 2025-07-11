package com.smartcoder.PaymentService.controller;

import com.smartcoder.PaymentService.model.PaymentRequest;
import com.smartcoder.PaymentService.model.PaymentResponse;
import com.smartcoder.PaymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest) {
        return new ResponseEntity<>(
                paymentService.doPayment(paymentRequest),
                HttpStatus.OK);
    }

    @GetMapping("order/{id}")
    public ResponseEntity<PaymentResponse> getPaymentDetailsByOrderId(@PathVariable("id") Long orderId) {
        return new ResponseEntity<>(
                paymentService.getPaymentDetailsByOrderId(orderId),
                HttpStatus.OK
        );
    }

}
