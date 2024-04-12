package patikaProjeler;
import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double km, perKm = 0.10, normalTutar, toplamT, indirimliT, yasİndirimi, gdİnd;
        int yas, yTip;
        boolean isEroor = false, islem = false;
        
        System.out.print("Gideceğiniz KM'yi giriniz: ");
        km = inp.nextDouble();
        if(km > 0){
            islem = true;
        } else {
            isEroor = true;
        }
        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();
        if(yas > 0){
            islem = true;
        } else {
            isEroor = true;
        }
        System.out.print("Dönüş bileti almak istiyorsanız 1'i istemiyorsanız 0'ı seçin: ");
        yTip = inp.nextInt();
        if(yTip == 1 || yTip == 0){
            islem = true;
        } else {
            isEroor = true;
        }

        if(isEroor){
            System.out.print("Hatalı Veri Girdiniz!");
        } else {
            normalTutar = km * perKm;
            if(yas < 12){
                if(yTip == 1){
                    yasİndirimi = normalTutar * 0.50;
                    indirimliT = normalTutar - yasİndirimi;
                    gdİnd = indirimliT * 0.20;
                    toplamT = (indirimliT - gdİnd) * 2;
                } else {
                    yasİndirimi = normalTutar * 0.50;
                    indirimliT = normalTutar - yasİndirimi;
                    toplamT = indirimliT;
                }
                System.out.println("Toplam tutar: " + toplamT);
            }
            if(yas >= 12 && yas <= 24){
                if(yTip == 1){
                    yasİndirimi = normalTutar * 0.10;
                    indirimliT = normalTutar - yasİndirimi;
                    gdİnd = indirimliT * 0.20;
                    toplamT = (indirimliT - gdİnd) * 2;
                } else {
                    yasİndirimi = normalTutar *0.10;
                    indirimliT = normalTutar - yasİndirimi;
                    toplamT = indirimliT;
                }
                System.out.print("Toplam tutar: " + toplamT);
            }
            if(yas > 65){
                if(yTip == 1){
                    yasİndirimi = normalTutar * 0.30;
                    indirimliT = normalTutar - yasİndirimi;
                    gdİnd = indirimliT * 0.20;
                    toplamT = (indirimliT - gdİnd) * 2;
                } else {
                    yasİndirimi = normalTutar * 0.30;
                    indirimliT = normalTutar - yasİndirimi;
                    toplamT = indirimliT;
                }
                System.out.print("Toplam tutar: " + toplamT);
            }

        }
        
                
    }   
    
}
