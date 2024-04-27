package patikaProjeler;

public class AsalSayi {
    public static void main(String[] args) {

        int asal = 0;
        for (int n = 2; n <= 100; n++) {
            for (int i = 2; i < (n - 1); i++) {
                if (n % i == 0) {
                    asal = 0;
                    break;
                } else {
                    asal = 1;
                }
            }
            if (asal == 1) {
                System.out.print(n + ", ");
            }
        }
    }
}