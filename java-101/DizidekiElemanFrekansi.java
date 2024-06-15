package patikaProjeler.basitProjeler;

import java.util.Arrays;

public class DizidekiElemanFrekansi {
    public static void main(String[] args) {
        int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int count = 1;
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] == list[i + 1]) {
                count++;
            } else {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar etti.");
                count = 1;
            }
        }
        System.out.println(list[list.length - 1] + " sayısı " + count + " kere tekrar etti.");
    }
}
