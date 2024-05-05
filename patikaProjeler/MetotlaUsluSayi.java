package patikaProjeler;

import java.util.Scanner;

public class MetotlaUsluSayi {
    static int kuvvet(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return kuvvet(x, y - 1) * x;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        int taban = inp.nextInt();

        System.out.print("Üs değeri giriniz: ");
        int us = inp.nextInt();

        System.out.println("Sonuç: " + kuvvet(taban, us));
    }
}