package patikaProjeler;
import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        int n, r;

        System.out.print("Kümenin eleman sayısını giriniz: ");
        n = inp.nextInt();

        System.out.print("Grupların eleman sayısını giriniz: ");
        r = inp.nextInt();

        long fktN = 1;
        for(int i = 1; i <= n; i++){
            fktN *= i;
        }
        long fktR = 1;
        for(int i = 1; i <= r; i++){
            fktR *= i;
        }
        long fktNR = 1;
        for(int i = 1; i <= (n - r); i++){
            fktNR *= i;
        }
        long kmbSonuc = fktN / (fktR * fktNR);

        System.out.println("C(" + n + ", " + r + ") = " + kmbSonuc);
    }
}
