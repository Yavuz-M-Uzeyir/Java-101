package baslangic_seviye_java_backend_web_patikasi.java_101;

import java.util.Scanner;

public class MetotlaHesapMakinesi {

    static int toplama(int a, int b) {
        int sonuc = a + b;
        System.out.println("====================");
        System.out.println("Sonuç: " + sonuc);
        return sonuc;
    }

    static int cıkarma(int a, int b) {
        int sonuc = a - b;
        System.out.println("====================");
        System.out.println("Sonuç: " + sonuc);
        return sonuc;
    }

    static int carpma(int a, int b) {
        int sonuc = a * b;
        System.out.println("====================");
        System.out.println("Sonuç: " + sonuc);
        return sonuc;
    }

    static int bolme(int a, int b) {
        int sonuc = a / b;
        System.out.println("====================");
        System.out.println("Sonuç: " + sonuc);
        return sonuc;
    }

    static int usAlma(int a, int b) {
        int toplam = 1;
        for (int i = 1; i <= b; i++) {
            toplam *= a;
        }
        System.out.println("====================");
        System.out.println("Sonuc: " + toplam);
        return toplam;
    }

    static int fkt(int a) {
        int sonuc = 1;
        for (int i = a; i >= 1; i--) {
            sonuc *= i;
        }
        System.out.println("====================");
        System.out.println("Sonuc: " + sonuc);
        return sonuc;
    }

    static int mod(int a, int b) {
        int sonuc = a % b;
        System.out.println("====================");
        System.out.println("Sonuç: " + sonuc);
        return sonuc;
    }

    static int alanCevre(int a, int b) {
        int alan = a * b;
        int cevre = 2 * (a + b);
        System.out.println("====================");
        System.out.println("Alan: " + alan + "\n" + "Çevre: " + cevre);
        return 0;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String menu = ""
                + "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış\n";

        int secim;
        while (true) {
            System.out.println("====================");
            System.out.print(menu);
            System.out.print("Yapmak istediğiniz işlemi seçin: ");
            secim = inp.nextInt();
            if (secim == 0) {
                break;
            }

            System.out.print("İlk sayı: ");
            int a = inp.nextInt();

            int b = 0;
            if (secim != 6) {
                System.out.print("İkinci sayı: ");
                b = inp.nextInt();
            }
            switch (secim) {
                case 1:
                    toplama(a, b);
                    break;

                case 2:
                    cıkarma(a, b);
                    break;

                case 3:
                    carpma(a, b);
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("====================");
                        System.out.println("İkinci sayı 0 olamaz! ");
                    } else {
                        bolme(a, b);
                    }
                    break;

                case 5:
                    usAlma(a, b);
                    break;

                case 6:
                    fkt(a);
                    break;

                case 7:
                    mod(a, b);
                    break;

                case 8:
                    alanCevre(a, b);
                    break;
            }
        }
    }
}