package patikaProjeler.basitProjeler;

import java.util.Scanner;

public class UcgenAlani {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int a, b, c;
        double u, d;

        System.out.print("A kenarını giriniz: ");
        a = inp.nextInt();

        System.out.print("B kenarını giriniz: ");
        b = inp.nextInt();

        System.out.print("C kenarını giriniz: ");
        c = inp.nextInt();

        u = (a + b + c) / 2;
        d = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        
        System.out.print("Üçgenin alanı: " + d);
    }
}
