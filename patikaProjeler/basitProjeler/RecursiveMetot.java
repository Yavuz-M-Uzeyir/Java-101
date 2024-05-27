package patikaProjeler.basitProjeler;

import java.util.Scanner;

public class RecursiveMetot {
    static int sayi(int n, int i) {
        System.out.print(n + " ");
        if (n - i == 0 || n - i < 0) {
            System.out.print(n - i + " ");
            return n - i;
        }
        int toplama = sayi(n - i, i) + i;
        System.out.print(toplama + " ");
        return toplama;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int sayi = inp.nextInt();

        int i = 5;
        sayi(sayi, i);
        System.out.print(sayi);
    }
}