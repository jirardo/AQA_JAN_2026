package org.prog.session2;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        int i = 0;
        Random random = new Random();
        while (i < 9999) {
            i = random.nextInt(1000);
            System.out.println(i);
            if (i % 7 == 0) {
                System.out.println("BREAK ON i%7 = 0");

                break;
            }


        }
    }   }