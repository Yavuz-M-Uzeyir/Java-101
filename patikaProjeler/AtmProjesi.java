package patikaProjeler;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int hak = 3;
        int bakiye = 1500;

        while(hak != 0){
            System.out.print("Kullanıcı adı giriniz: ");
            kullaniciAdi = inp.nextLine();
            System.out.print("Parolayı giriniz: ");
            sifre = inp.nextLine();

        if(kullaniciAdi.equals("1") && sifre.equals("1")){

            System.out.println("Başarıyla giriş yaptınız.");
            System.out.print(  "1- Para yatırma\n" + 
                               "2- Para çekme\n" + 
                               "3- Bakiye sorgulama\n" + 
                               "4- Çıkış yapma\n" + 
                               "Yapmak istediğiniz işlemi seçiniz: ");
            int secim = inp.nextInt();

            switch(secim){
                case 1:
                System.out.print("Yatırılacak miktarı giriniz: ");
                int yatir = inp.nextInt();
                bakiye += yatir;
                break;

                case 2:
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int cek = inp.nextInt();
                if(cek > bakiye){
                    System.out.print("Hesabınızda yeterli miktarda para yoktur tekrar deneyiniz!");

                } else {
                    bakiye -= cek;
                }
                break;

                case 3:
                System.out.print("Mevcut bakiyeniz : " + bakiye);
                break;
                
            }
                             
            break;
            
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı tekrar deneyiniz kalan hakkınız " + --hak);
            
        }
        }
    }
    
}
