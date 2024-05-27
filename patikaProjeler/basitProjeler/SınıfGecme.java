package patikaProjeler.basitProjeler;

import java.util.Scanner;

public class SınıfGecme {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;
        double sonuc = 0, ortalama = 0, bDers = 0;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();
        if(mat >= 0 && mat <= 100){
            ortalama =+ mat;
            bDers =+ 1;
        } else {
            System.out.println("Notunuz 0-100 arası olmadığından değerlendirmeye alınmamıştır! ");
        }

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        if(fizik >= 0 && fizik <= 100){
            ortalama =+ fizik;
            bDers =+ 1;
        } else {
            System.out.println("Notunuz 0-100 arası olmadığından değerlendirmeye alınmamıştır! ");
        }

        System.out.print("Türkce notunuzu giriniz: ");
        turkce = inp.nextInt();
        if(turkce >= 0 && turkce <= 100){
            ortalama =+ turkce;
            bDers =+ 1;
        } else {
            System.out.println("Notunuz 0-100 arası olmadığından değerlendirmeye alınmamıştır! ");
        }

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();
        if(kimya >= 0 && kimya <= 100){
            ortalama =+ kimya;
            bDers =+ 1;
        } else {
            System.out.println("Notunuz 0-100 arası olmadığından değerlendirmeye alınmamıştır! ");
        }

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();
        if(muzik >= 0 && muzik <= 100){
            ortalama =+ kimya;
            bDers =+ 1;
        } else {
            System.out.println("Notunuz 0-100 arası olmadığından değerlendirmeye alınmamıştır! ");
        }
        sonuc = ortalama / bDers;
        if(sonuc >= 55){
            System.out.print("Sınıfı geçtiniz ortalamanız: " + sonuc);
        } else {
            System.out.print("Sınıf tekrarı ortalamanız: " + sonuc);
        }
    }
    
}
