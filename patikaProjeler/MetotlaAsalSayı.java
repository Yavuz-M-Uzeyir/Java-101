package patikaProjeler;

import java.util.Scanner;

public class MetotlaAsalSayı {
    static int asal(int sayi, int i) {
        if (sayi == i) {
            return 1;
        } else if (sayi % i == 0) {
            return 0;
        }
        return asal(sayi, i + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = inp.nextInt();
        int i = 2;

        int asalmi = asal(n, i);
        if (asalmi == 1) {
            System.out.print(n + " Sayısı asaldır !");
        } else {
            System.out.print(n + " Sayısı asal değildir !");
        }
    }
}