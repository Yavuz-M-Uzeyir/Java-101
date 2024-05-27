package patikaProjeler.basitProjeler;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int nm1, nm2, secim, sonuc;

        System.out.print("1. Sayıyı giriniz: ");
        nm1 = inp.nextInt();

        System.out.print("2. Sayıyı gitiniz: ");
        nm2 = inp.nextInt();

        System.out.print("Toplama için '1' Çıkarma için '2' Çarpma için '3' Bölme için '4' giriniz: ");
        secim = inp.nextInt();

        switch(secim){
            case 1:
            sonuc = nm1 + nm2;
            System.out.print("İşleminizin sonucu: " + sonuc);
            break;

            case 2:
            sonuc = nm1 - nm2;
            System.out.print("İşleminizin sonucu: " + sonuc);
            break;

            case 3:
            sonuc = nm1 * nm2;
            System.out.print("İşleminizin sonucu: " + sonuc);
            break;

            case 4:
            if(nm2 == 0){
                System.out.print("Bir sayı sıfıra bölünemez!");    
            } else {
                sonuc = nm1 / nm2;
                System.out.print("İşleminizin sonucu: " + sonuc);
            
            } default: {
                System.out.print("Hatalı seçim yaptınız! ");
            }
            
        }

    }
}