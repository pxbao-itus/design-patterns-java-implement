package com.tma.pxbao.dependency_injection;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1);
        client1.execute();
        Client client2 = new Client(2);
        client2.execute();
        Client client3 = new Client(3);
        client3.execute();
    }
}
