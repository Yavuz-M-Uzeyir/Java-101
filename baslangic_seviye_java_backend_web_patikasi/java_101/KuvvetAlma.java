package baslangic_seviye_java_backend_web_patikasi.java_101;
import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n, a, b;

        System.out.print("Limit giriniz: ");
        n = inp.nextInt();

        for(a = 1; a <= n; a*=4){
            System.out.println("4'ün kuvveti: " + a);
        }
        for(b = 1; b <= n; b*=5){
            System.out.println("5'in kuvveti: " + b);
        }
    }
}
