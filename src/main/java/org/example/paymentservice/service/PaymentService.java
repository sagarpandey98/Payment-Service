package org.example.paymentservice.service;

import com.razorpay.RazorpayException;
import com.razorpay.Webhook;
import org.springframework.web.bind.annotation.RequestBody;

public interface PaymentService {
    String createPaymentLink(String orderId) throws RazorpayException;
    String getPaymentStatus(String orderId);
    public void handleWebhookEvent(Webhook webhook);
}
