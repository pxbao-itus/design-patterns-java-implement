package com.tma.pxbao.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setCost((int) Math.round(Math.random() * 10000));
        paymentService.setDeliveryService((int) (Math.random() * 2) > 0.5);

        Scanner scanner = new Scanner(System.in);
        loop: do {
            System.out.println("1. Enter C to pay by credit card\n2. Enter P to pay by Paypal\n3. Enter X to exit");
            String paymentMethod = scanner.nextLine();
            switch (paymentMethod.toUpperCase()) {
                case "X": {
                    return;
                }
                case "C": {
                    paymentService.setPaymentStrategy(new PaymentByCreditCard());
                    break;
                }
                case "P": {
                    paymentService.setPaymentStrategy(new PaymentByPaypal());
                    break;
                }
                default: {
                    System.out.println("Invalid option");
                    continue loop;
                }
            }
            paymentService.processOrder();
        }while (true);

    }


}