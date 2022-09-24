package com.company;

public class Main {

    public static void main(String[] args) {
        // tpel zuyg tvery
        int n;
        System.out.println("0-100 mijakayqum zuyq tvern en");
        for (n = 0; n < 100; n++) {
            if (n % 2 == 0) {
                System.out.println("n = " + n);
            }
        }
        System.out.println("n = " + n++);

        // tpel kent tvery
        System.out.println("0-100 mijakayqum kent tvern en");
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
        }
        // tpel 3-i bajanvox tvery
        System.out.println("0 -100 mijakayqum tver voronq bajanvum en 3-i");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("i = " + i);
            }
        }

        // tpel 0-100 tveri factorialy
        double y = 1;
        System.out.println("0-100 tveri faktorial");
        for (int i = 1; i <= 100; i++) {
            y = y * i;
            System.out.println("l = " + y);
        }

        // tpel 0-100 tveri gumary
        int l = 0, h = 0;
        System.out.println("0-100 tveri gumary");
        while (h <= 100) {
            l = l + h;
            h++;
        }
        System.out.println("l = " + l);

        // tpel patkerner
        for (int i = 1; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("-");

            }
            System.out.println();
        }

        for (int i = 1; i < 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }
            for (int c = i; c > 0; c--) {
                System.out.print(" " + c);
            }
            System.out.println(" ");
        }

        // fory fori mej
        for (int i = 1; i < 11; i++) {
            System.out.println("i = " + i);
            System.out.println("^^^^^^^^^^^^^^^");

            for (int j = 1; j < 11; j++) {
                System.out.println(" j = " + j);
            }
            System.out.println("^^^^^^^^^^^^^^^");
        }
        // whiley whilei mej
        int i = 1;
        while (i < 11) {
            System.out.println("i = " + i);
            System.out.println("///////////");
            int j = 1;
            while (j < 11) {
                System.out.println("j = " + j);
                j++;
            }
            i++;
        }
        System.out.println("///////////");

        // fory whili mej
        int a = 1;
        while (a < 11) {
            System.out.println("a = " + a);
            System.out.println("_____________");
            for (int b = 1; b < 11; b++) {
                System.out.println("b = " + b);
            }
            a++;
        }
        System.out.println("_____________");

        // whily fori mej
        for (int d = 1; d < 11; d++) {
            System.out.println("d = " + d);
            System.out.println("!!!!!!!!!!!!!!!");
            int s = 1;
            while (s < 11) {
                System.out.println("s = " + s);
                s++;
            }
            System.out.println("!!!!!!!!!!!!!!!");
        }
    }
}




