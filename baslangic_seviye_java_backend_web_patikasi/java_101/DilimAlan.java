package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class DilimAlan {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double n = 3.14, r, a, dilimAlan;

        System.out.print("Yarıçapı giriniz: ");
        r = inp.nextDouble();

        System.out.print("Merkez açı ölçüsünü giriniz: ");
        a = inp.nextDouble();

        dilimAlan = (n * (r*r) * a) / 360;

        System.out.print("Dairenin dilim alanı: " + dilimAlan);
    }
}
