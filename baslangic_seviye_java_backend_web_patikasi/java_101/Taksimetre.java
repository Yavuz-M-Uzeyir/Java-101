package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double kmUcreti = 2.20, tutar, mesafe;
        int min = 20, acilis = 10;

        System.out.print("Gidilecek mesafeyi (KM) giriniz: ");
        mesafe = inp.nextInt();

        tutar = mesafe * kmUcreti + acilis;
        tutar = (tutar < 20) ? min : tutar;

        System.out.print("Toplam tutar: " + tutar);
    }
}
