package baslangic_seviye_java_backend_web_patikasi.java_101;

public class DizilerIleB {
    public static void main(String[] args) {
        String[][] letter = new String[7][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (j == 0) {
                    letter[i][j] = "* ";
                } else if (i == 0 && j < 4) {
                    letter[i][j] = "* ";
                } else if (i == 1 && j == 4) {
                    letter[i][j] = "* ";
                } else if (i == 2 && j == 4) {
                    letter[i][j] = "* ";
                } else if (i == 3 && j < 4) {
                    letter[i][j] = "* ";
                } else if (i == 4 && j == 4) {
                    letter[i][j] = "* ";
                } else if (i == 5 && j == 4) {
                    letter[i][j] = "* ";
                } else if (i == 6 && j < 4) {
                    letter[i][j] = "* ";
                } else {
                    letter[i][j] = "  ";
                }
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }
    }
}
