package patikaProjeler;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        int yil;

        System.out.print("Yıl giriniz: ");
        yil = inp.nextInt();

        if(yil % 4 == 0){
            if(yil % 100 == 0){
                if(yil % 400 == 0){
                    System.out.print(yil + " bir artık yıldır! ");
                } else {
                    System.out.print(yil + " artık bir yıl değildir! ");
                }
            } else {
                System.out.print(yil + " bir artık yıldır! ");
            }
        } else {
            System.out.print(yil + " bir artık yıl değildir! ");
        }
    }
}          