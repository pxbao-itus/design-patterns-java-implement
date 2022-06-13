package com.tma.pxbao.strategy;

public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean isValidationPaymentDetails();

    void pay(int amount);
}

class PaymentByCreditCard implements PaymentStrategy {

    private CreditCard card;

    // Collect information of user's card
    @Override
    public void collectPaymentDetails() {
        card = new CreditCard("Card Number", "Expired Date", "CVV number");
    }

    // Checking information above is valid or invalid
    @Override
    public boolean isValidationPaymentDetails() {
        return true;
    }

    // Executing paying
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);
    }
}

class PaymentByPaypal implements PaymentStrategy {

    private Paypal account;

    @Override
    public void collectPaymentDetails() {
        account = new Paypal("pxbao@tma.com.vn", "123123123");
    }

    @Override
    public boolean isValidationPaymentDetails() {
        return true;
    }

    @Override
    public void pay(int amount) {
        if (account.getAmount() >= amount) {
            System.out.println("Paying " + amount + " by using Paypal");
            account.setAmount(account.getAmount() - amount);
        } else {
            System.out.println("Payment is failed");
        }
    }
}