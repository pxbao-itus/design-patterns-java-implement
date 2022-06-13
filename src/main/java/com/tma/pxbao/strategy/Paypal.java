package com.tma.pxbao.strategy;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Paypal {
    private String email;
    private String password;
    private int amount = (int) Math.round(Math.random() * 10000000);

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    
}
