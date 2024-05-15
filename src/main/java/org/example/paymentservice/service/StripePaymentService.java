package org.example.paymentservice.service;

import com.razorpay.Webhook;
import org.springframework.web.bind.annotation.RequestBody;

public class StripePaymentService implements PaymentService{
    @Override
    public String createPaymentLink(String orderId) {
        return null;
    }

    @Override
    public String getPaymentStatus(String orderId) {
        return null;
    }

    @Override
    public void handleWebhookEvent(Webhook webhook) {

    }
}
