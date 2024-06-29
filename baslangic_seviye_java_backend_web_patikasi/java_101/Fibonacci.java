package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        int n = inp.nextInt();

        int x = 0, y = 1, z;
        int i = 1;

        while (i <= n) {
            System.out.print(x + ", ");
            z = x + y;
            x = y;
            y = z;
            i++;
        }
    }

}
