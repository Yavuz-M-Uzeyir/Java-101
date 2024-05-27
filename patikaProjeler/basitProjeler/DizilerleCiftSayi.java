package patikaProjeler.basitProjeler;

import java.util.Arrays;

public class DizilerleCiftSayi {

    static boolean isFind(int[] arr, int val) {
        for (int i : arr) {
            if (i == val) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = { 1, 3, 1, 2, 4, 2, 4 };
        int[] evenNum = new int[list.length];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(evenNum, list[i]))
                        evenNum[index++] = list[i];
                    break;
                }
            }
        }

        for (int i : evenNum) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
