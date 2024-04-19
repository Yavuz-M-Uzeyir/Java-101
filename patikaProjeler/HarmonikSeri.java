package patikaProjeler;
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int n = inp.nextInt();

        double toplam = 0;
        for(int i = 1; i <= n; i++){
            toplam += 1.0 / i;
        }
        System.out.println(toplam);
    }
    
}
