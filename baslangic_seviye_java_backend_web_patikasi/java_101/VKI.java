package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class VKI {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        
        double boy, kg, vki;

        System.out.print("Boyunuzu (metre) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kg = inp.nextDouble();

        vki = kg / (boy * boy);

        System.out.print("Vücüt kitle indeksiniz: " + vki);

    }
    
}
