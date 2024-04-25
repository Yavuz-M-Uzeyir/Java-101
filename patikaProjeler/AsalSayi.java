package patikaProjeler;

import java.util.Scanner;
import java.util.ArrayList;

public class AsalSayi {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            if (i == 2) {
                liste.add(2);
            } else if (i == 3) {
                liste.add(3);
            } else if (i == 5) {
                liste.add(5);
            } else if (i == 7) {
                liste.add(7);
            } else {
                if (i % 2 != 0) {
                    if (i % 3 != 0) {
                        if (i % 5 != 0) {
                            if (i % 7 != 0) {
                                liste.add(i);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(liste);

    }
}
