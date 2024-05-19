package patikaProjeler;

public class DizilerleHarmonikSeri {
    public static void main(String[] args) {
        int[] list = { 1, 2, 3, 4, 5, 16, 7, 99, 21 };
        double harmonikToplam = 0.0;

        for (int i = 0; i < list.length; i++) {
            harmonikToplam += 1.0 / list[i];
        }

        double harmonikOrtalama = list.length / harmonikToplam;
        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }
}
