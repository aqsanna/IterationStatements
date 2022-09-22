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
        int k;
        System.out.println("0-100 mijakayqum kent tvern en");
        for (k = 0; k < 100; k++) {
            if (k % 2 != 0) {
                System.out.println("k = " + k);
            }
        }
        // tpel 3-i bajanvox tvery
        int m;
        System.out.println("0 -100 mijakayqum tver voronq bajanvum en 3-i");
        for (m = 1; m <= 100; m++) {
            if (m % 3 == 0) {
                System.out.println("m = " + m);
            }
        }
        // tpel 0-100 tveri actorialy
        int i;
        double j = 1;
        System.out.println("0-100 tveri faktorial");
        for (i = 1; i <= 100; i++) {
            j = j * i;
            System.out.println("j = " + j);
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

        for (int a = 1; a < 10; a++) {
            for (int b = a; b < 10; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int yy = 1; yy < 10; yy++) {
            for (int jj = 1; jj < yy ; jj++) {
                System.out.print("-");

            }
            System.out.println();
        }

        for (int a = 1; a < 10; a++) {
            for (int b = a; b < 10; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



