package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Arrays;
import java.util.Scanner;

public class DiziYakinUzak {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
        Arrays.sort(list);

        System.out.print("Sayı referansı giriniz : ");
        int num = inp.nextInt();

        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (i < num) {
                min = i;
            }
            if (i > num) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
