package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = inp.nextInt();
        
        int mukemmel = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i != n) {
                mukemmel += i;
            }
        }
        if (n == mukemmel) {
            System.out.print(mukemmel + " Mükemmel sayıdır. ");
        } else {
            System.out.print(n + " Mükemmel sayı değildir. ");
        }
    }

}
