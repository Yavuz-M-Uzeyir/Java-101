package patikaProjeler;
import java.util.Scanner;

public class SayiOrt {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, toplam = 0, bolum = 0;

        System.out.print("Sayı giriniz: ");
        sayi = inp.nextInt();
        
        for(int i = 0; i <= sayi; i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam += i;
                bolum++;
            }
            
        }
        double ort = bolum > 0 ? toplam / bolum: 0;
        System.out.print(ort);
    }
    
}
