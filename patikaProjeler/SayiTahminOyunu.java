package patikaProjeler;

import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100);

        System.out.println(randomNum);
        int healt = 0;
        int guess;
        int[] wrongGuess = new int[5];
        boolean isWrong = false;
        while (healt <= 4) {
            System.out.print("Tahmininizi girin : ");
            guess = inp.nextInt();
            if (guess < 0 || guess > 100) {
                System.out.println("Lütfen 0 - 100 arasında bir sayı giriniz! ");
                if (isWrong) {
                    healt++;
                    System.out.println("Kalan hakkınız : " + (5 - healt));
                } else {
                    System.out.println("Birdahaki yanlışınızda hakkınızdan düşülecektir! ");
                    isWrong = true;
                }
                continue;
            }
            if (guess == randomNum) {
                System.out.println("Tebrikler sayıyı doğru tahmin ettiniz. ");
                break;
            } else {
                if (guess > randomNum) {
                    System.out.println("Tahmininiz sayıdan büyük. ");
                } else {
                    System.out.println("Tahmininiz sayıdan küçük. ");
                }
                wrongGuess[healt++] = guess;
                System.out.println("Kalan canınız " + (5 - healt));
            }
        }
        if (healt == 5) {
            System.out.println("Kaybettiniz! ");
        }
        System.out.println("Yanlış tahminleriniz : " + Arrays.toString(wrongGuess));
    }
}
