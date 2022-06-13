package com.tma.pxbao.state;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Scanner scanner = new Scanner(System.in);
        // illustration user push home button and power button on mobile phone
        do {
            System.out.println("\nEnter H is Home Button or X is on/off button or P to exit");
            String button = scanner.nextLine();
            switch (button.toUpperCase()) {
                case "P": {
                    return;
                }
                case "H": {
                    System.out.println(phone.state.onHome());
                    break;
                }
                case "X": {
                    System.out.println(phone.state.onPower());
                    break;
                }
                default: {
                    break;
                }
            }
        } while (true);
    }
}
