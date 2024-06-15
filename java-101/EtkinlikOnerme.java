package patikaProjeler.basitProjeler;
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int sicaklik;

        System.out.print("Sıcaklığı giriniz: ");
        sicaklik = inp.nextInt();

        if(sicaklik > 25){
            System.out.print("Yüzmeye Gidebilirsiniz. ");
        }else if(sicaklik <= 25){
            if(sicaklik >= 15 && sicaklik <= 25){
                System.out.println("Pikniğe gidebilirsiniz. ");
            }if(sicaklik >= 5 && sicaklik <= 15){
                System.out.println("Sinemaya gidebilirsiniz. ");
            } else if(sicaklik < 5){
                System.out.print("Kayak yapmaya gidebilirsiniz. ");
            }
        }    
    }
    
}
