package baslangic_seviye_java_backend_web_patikasi.java_101;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String kullaniciAdi, sifre;
        int hak = 3;
        int bakiye = 1500;
        int secim;

        while(hak != 0){
            System.out.print("Kullanıcı adı giriniz: ");
            kullaniciAdi = inp.nextLine();
            System.out.print("Parolayı giriniz: ");
            sifre = inp.nextLine();

        if(kullaniciAdi.equals("1") && sifre.equals("1")){

            System.out.println("Başarıyla giriş yaptınız.");
            
            do{
                System.out.print(   "1- Para yatırma\n" + 
                                    "2- Para çekme\n" + 
                                    "3- Bakiye sorgulama\n" + 
                                    "4- Çıkış yapma\n" + 
                                    "Yapmak istediğiniz işlemi seçiniz: ");
                secim = inp.nextInt();

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
                    System.out.println("Hesabınızda yeterli miktarda para yoktur tekrar deneyiniz!");

                } else {
                    bakiye -= cek;
                }
                break;

                case 3:
                System.out.println("Mevcut bakiyeniz : " + bakiye);
                break;
                
                case 4:
                break;

                default:
                System.out.println("Geçersiz seçim yaptınız tekrar deneyiniz. ");

            }

            }while( secim != 4);{
                System.out.print("Tekrar görüşmek üzere.");
            }
                             
            break;
            
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı tekrar deneyiniz kalan hakkınız " + --hak);
            switch(hak){
                case 0:
                System.out.print("Hesabınız bloke olmuştur lütfen bankayla iletişime geçiniz! ");
                break;
            }
            
        }
        }
    }
    
}
