package patikaProjeler.basitProjeler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksizniz: ");
        int n = inp.nextInt();

        int min = 0, max = 0;
        int i = 0;
        int sayi;

        while (i < n) {
            i++;
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi = inp.nextInt();
            if (sayi < min || min == 0) {
                min = sayi;
            }
            max = sayi;
        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}