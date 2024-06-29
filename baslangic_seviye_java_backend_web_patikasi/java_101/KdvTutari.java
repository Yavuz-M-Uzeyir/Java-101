package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class KdvTutari {

    public static void main(String[] args) {

        Scanner imp = new Scanner(System.in);

        double tutar, kdvOrani, kdvTutari, kdvliTutar;
        boolean kdvDurumu;

        System.out.print("Bir Tutar Giriniz: ");
        tutar = imp.nextDouble();

        kdvDurumu = ( 0 < tutar ) && ( tutar <= 1000 );
        kdvOrani = kdvDurumu ? 0.18 : 0.08;

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
        System.out.println("KDV tutarı: " + kdvTutari);
        System.out.println("KDV Oranı: " + kdvOrani);

    }
}
