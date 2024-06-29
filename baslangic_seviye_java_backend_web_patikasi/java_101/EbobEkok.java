package baslangic_seviye_java_backend_web_patikasi.java_101;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int n1 = inp.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int n2 = inp.nextInt();
        
        int ebob = 1;
        int ekok = 1;
        int i = n1, j = n2;

        if(n1 < n2){

            while(i >= 1){
                if((n1 % i == 0) && (n2 % i == 0)){
                    ebob = i;
                    System.out.println("Ebob: " + ebob);
                    break;
                }
                i--;
            }
        } else {

            while(j >= 1){
                if((n1 % j == 0) && (n2 % j == 0)){
                    ebob = j;
                    System.out.println("Ebob: " + ebob);
                    break;
                }
                j--;
            }
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Ekok: " + ekok);
    }
}
