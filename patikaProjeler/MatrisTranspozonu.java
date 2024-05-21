package patikaProjeler;

public class MatrisTranspozonu {
    public static void main(String[] args) {
        int[][] matrisA = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] transpoze = new int[matrisA[0].length][matrisA.length];

        for (int i = 0; i < matrisA.length; i++) {
            for (int j = 0; j < matrisA[i].length; j++) {
                transpoze[j][i] = matrisA[i][j];
            }
        }

        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[i].length; j++) {
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }

    }
}
