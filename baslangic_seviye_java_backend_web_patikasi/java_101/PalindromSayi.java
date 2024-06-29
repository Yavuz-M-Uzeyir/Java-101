package baslangic_seviye_java_backend_web_patikasi.java_101;

public class PalindromSayi {

    static String palidrom(int sayi) {
        int geciciSayi = sayi, tersSayi = 0, sonSayi;
        while (geciciSayi != 0) {
            sonSayi = geciciSayi % 10;
            tersSayi = (tersSayi * 10) + sonSayi;
            geciciSayi /= 10;
        }
        if (sayi == tersSayi) {
            return +sayi + " Palindrom Bir sayıdır";
        } else {
            return +sayi + " Palindrom Bir sayı değildir";
        }
    }

    public static void main(String[] args) {
        System.out.println(palidrom(111));
    }
}