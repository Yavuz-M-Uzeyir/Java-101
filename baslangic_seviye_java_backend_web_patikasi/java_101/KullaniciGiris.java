package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class KullaniciGiris {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        String kullaniciAdi, sifre, yeniSifre;

        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi = inp.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        sifre = inp.nextLine();

        if(kullaniciAdi.equals("admin") && sifre.equals("admin123")){
            System.out.print("Giriş yaptınız!");
            
        } else {
            System.out.print("Şifreniz yanlış sıfırlamak istiyorsanız '1'i istemiyorsanız '2'yi seçin: ");
                    
            int secim = inp.nextInt();
            inp.nextLine();
        
            switch (secim) {
            case 1:
            System.out.print("Yeni şifrenizi giriniz: ");
            yeniSifre = inp.nextLine();
            
            if(yeniSifre.equals(sifre) || yeniSifre.equals("admin123")){
                System.out.print("Şifre oluşturulamadı lütfen başka şifre giriniz!");
            } else {
                System.out.print("Şifre oluşturuldu!");
            }
            break;

            case 2:
            System.out.print("Tekrar deneyin!");
            break;
            
            default:
            System.out.print("Lütfen geçerli bir seçim yapınız!");
       }
    }
  }
}
