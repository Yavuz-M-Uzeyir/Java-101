package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double armutKg, elmaKg, dmtsKg, muzKg, ptlcnKg, armut = 2.14, elma = 3.67, dmts = 1.11, muz = 0.95, ptlcn = 5, toplam;
        
        System.out.print("Armut KG: ");
        armutKg = inp.nextDouble();

        System.out.print("Elma KG: ");
        elmaKg = inp.nextDouble();

        System.out.print("Domates KG: ");
        dmtsKg = inp.nextDouble();

        System.out.print("Muz KG: ");
        muzKg = inp.nextDouble();

        System.out.print("Patlıcan KG: ");
        ptlcnKg = inp.nextDouble();

        toplam = (armutKg * armut) + (elmaKg * elma) + (dmtsKg * dmts) + (muzKg * muz) + (ptlcnKg * ptlcn);

        System.out.print("Toplam tutar: " + toplam);
    }
    
}
