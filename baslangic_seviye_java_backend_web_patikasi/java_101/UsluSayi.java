package baslangic_seviye_java_backend_web_patikasi.java_101;
import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int n, k;
        int toplam = 1;

        System.out.print("Üssü alınacak sayı: ");
        n = inp.nextInt();

        System.out.print("Üs olacak sayı: ");
        k = inp.nextInt();

        for(int i = 1; i <= k; i++){
            toplam *= n;
        }
        System.out.print(toplam);
    }
    
}
