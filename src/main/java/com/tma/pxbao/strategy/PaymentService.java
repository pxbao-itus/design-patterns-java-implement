package com.tma.pxbao.strategy;


import lombok.Setter;

@Setter
public class PaymentService {
    private int cost;
    private boolean isDeliveryService;

    private PaymentStrategy paymentStrategy;


    public void processOrder() {
        paymentStrategy.collectPaymentDetails();
        if(paymentStrategy.isValidationPaymentDetails()) {
            paymentStrategy.pay(this.getTotal());
        }
    }

    // Return total cost when using delivery service or not
    public int getTotal() {
        return isDeliveryService ? cost + 1000 : cost;
    }
}
