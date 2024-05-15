package org.example.paymentservice.controller;

import com.razorpay.RazorpayException;
import com.razorpay.Webhook;
import org.example.paymentservice.dtos.CreatePaymentLinkRequestDto;
import org.example.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private PaymentService paymentService;
    public PaymentController(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    @PostMapping("/")
    public String createPaymentLink(@RequestBody CreatePaymentLinkRequestDto createPaymentLinkRequestDto) throws RazorpayException {
        return this.paymentService.createPaymentLink(createPaymentLinkRequestDto.getOrderId());
    }
    @GetMapping("/webhook")
    public void handleWebhookEvent(@RequestBody Webhook webhook) {
        paymentService.handleWebhookEvent(webhook);
    }
}
