package com.tma.pxbao.singleton;

import lombok.Data;

@Data
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private String name;
    private String email;


    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
