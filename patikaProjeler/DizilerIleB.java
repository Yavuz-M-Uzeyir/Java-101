package patikaProjeler;

public class DizilerIleB {
    public static void main(String[] args) {
        String[][] letter = new String[6][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || j == 0) {
                    letter[i][j] = " * ";
                } else if (i == 2 || j == 3) {
                    letter[i][j] = " * ";
                } else if (i == 5) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
                System.out.print(letter[i][j]);
            }
            System.out.println();
        }

    }
}
