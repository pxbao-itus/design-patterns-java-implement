package com.tma.pxbao.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CreditCard {
    private String cardNumber;
    private String expiredDate;
    private String cvv;
    private int amount = (int) Math.round(Math.random() * 10000000);

    public CreditCard(String cardNumber, String expiredDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiredDate = expiredDate;
        this.cvv = cvv;
    }
}
