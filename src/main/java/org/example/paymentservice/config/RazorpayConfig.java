package org.example.paymentservice.config;

import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RazorpayConfig {
    @Value("${Razorpay.key}")
    private String keyId;

    @Value("${Razorpay.secret}")
    private String keySecret;
    @Bean
    public RazorpayClient createRazorpayClient() throws RazorpayException {
        return new RazorpayClient(keyId,
                                keySecret);
    }
}
