package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Dizinin boyutu : ");
        int size = inp.nextInt();
        int[] list = new int[size];

        int index = 0;
        System.out.println("Dizinin elemanlarını giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(i + 1 + ". Elemanı : ");
            int element = inp.nextInt();
            list[index++] = element;
        }

        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));
    }

}
