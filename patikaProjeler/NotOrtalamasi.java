package patikaProjeler;

import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        String gk = sonuc >= 60 ? " Sınıfı geçti" : " Sınıfta kaldı";

        System.out.print("Not ortalamanız: "+ sonuc + gk);


    }
}
