package com.tma.pxbao.singleton;

public class Main {
    public static void main(String[] args) {
        BillPughSingleton.getInstance().setEmail("abc");
        System.out.println(BillPughSingleton.getInstance().getEmail());

    }
}
