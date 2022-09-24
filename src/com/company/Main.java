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
            for (int jj = 1; jj < yy; jj++) {
                System.out.print("-");

            }
            System.out.println();
        }

        for (int a = 1; a < 7; a++) {
            for (int b = 7; b >= a; b--) {
                System.out.print(" ");
            }
            for (int c = a; c > 0; c--) {
                System.out.print(" " + c);
            }
            System.out.println(" ");
        }

        // fory fori mej
        for (int p = 1; p < 11; p++) {
            System.out.println("p = " + p);
            System.out.println("^^^^^^^^^^^^^^^");

            for (int y = 1; y < 11; y++) {
                System.out.println(" y = " + y);
            }
            System.out.println("^^^^^^^^^^^^^^^");
        }
        // whiley whilei mej
        int p = 1;
        while (p < 11) {
            System.out.println("p = " + p);
            System.out.println("&&&&&&&&&&&&&&&&");
            int y = 1;
            while (y < 11) {
                System.out.println("y = " + y);
                y++;
            }
            p++;
        }
        System.out.println("&&&&&&&&&&&&&&&&");

        // fory whili mej
        int uu = 1;
        while (uu < 11) {
            System.out.println("uu = " + uu);
            System.out.println("@@@@@@@@@@@@@@");
            for (int tt = 1; tt < 11; tt++) {
                System.out.println("tt = " + tt);
            }
            uu++;
        }
        System.out.println("@@@@@@@@@@@@@@@@");

        // whily fori mej
        for (int d = 1; d < 11; d++) {
            System.out.println("d = " + d);
            System.out.println("!!!!!!!!!!!!!!!!!!");
            int s = 1;
            while (s < 11) {
                System.out.println("s = " + s);
                s++;
            }
            System.out.println("!!!!!!!!!!!!!!!!!");
        }
    }
}




