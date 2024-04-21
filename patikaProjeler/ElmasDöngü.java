package patikaProjeler;
import java.util.Scanner;

public class ElmasDöngü {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        /*

         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *

        */

        System.out.print("Basamak sayısını giriniz: ");
        int n = inp.nextInt();
        
        for(int satir = 1; satir <= n; satir++){

            for(int bosluk = 1; bosluk <= n - satir; bosluk++){
                System.out.print(" ");
            }
            for(int yildiz = 1; yildiz <= (2*satir) - 1; yildiz++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int satir = n - 1; satir >= 1; satir--){

            for(int bosluk = 1; bosluk <= n - satir; bosluk++){
                System.out.print(" ");
            }
            for(int yildiz = 1; yildiz <= (2*satir) - 1; yildiz++){
                System.out.print("*");
            }
            System.out.println();
        } 

    }
    
}