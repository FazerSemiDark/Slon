package org.example;

import java.util.Scanner;

public class SlonCli {
    public static void main(String[] args) {
        Slon seller = new Slon();
        System.out.println(seller.hello());

        try (Scanner in = new Scanner(System.in)) {
            String text;
            while ((text = in.nextLine()) != null && !seller.exitCommand(text)) {
                if (!text.isEmpty()) {
                    System.out.println();
                }
                System.out.println(seller.react(text));
            }
        }
    }
}