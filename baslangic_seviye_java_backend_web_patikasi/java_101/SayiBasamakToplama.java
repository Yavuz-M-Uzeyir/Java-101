package baslangic_seviye_java_backend_web_patikasi.java_101;
import java.util.Scanner;

public class SayiBasamakToplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = inp.nextInt();
        
        int toplam = 0;
        while(sayi != 0){
            int basamakDeger = sayi % 10;
            toplam += basamakDeger;
            sayi /= 10;
        }
        System.out.println(toplam);
    }   
    
}