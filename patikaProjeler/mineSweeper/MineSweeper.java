package patikaProjeler.mineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner inp = new Scanner(System.in);
    Random rand = new Random();
    String[][] board;
    String[][] map;
    int line;
    int column;
    int mine;

    MineSweeper(int line, int column) {

        if (line >= 2 && column >= 2) {

            this.line = line;
            this.column = column;
            this.mine = (this.line * this.column) / 4;

            this.board = new String[this.line][this.column];
            this.map = new String[this.line][this.column];

            for (int i = 0; i < this.board.length; i++) {
                for (int j = 0; j < this.board[i].length; j++) {
                    this.board[i][j] = "-";
                    this.map[i][j] = "-";
                }
            }
        } else {
            System.out.println("Satır ve stün 2 den az olamaz.");
        }
    }

    void play() {

        plantMine();

    }

    boolean isSelectTrue() {

        System.out.print("Satır giriniz : ");
        int line = inp.nextInt();

        System.out.print("Stün seçiniz : ");
        int column = inp.nextInt();

        if ((line < 0 || line >= this.line) || (column < 0 || column >= this.column)) {
            return true;
        }
        return false;
    }

    void plantMine() {

        int randomLine;
        int randomColumn;
        int i = 0;
        while (i < this.mine) {
            randomLine = rand.nextInt(this.line);
            randomColumn = rand.nextInt(this.column);
            if (this.map[randomLine][randomColumn].equals("-")) {
                this.map[randomLine][randomColumn] = "*";
                i++;
            }
        }
    }

    void printBoard(String[][] mtrx) {

        for (int i = 0; i < mtrx.length; i++) {
            for (int j = 0; j < mtrx[i].length; j++) {
                System.out.print(mtrx[i][j] + " ");
            }
            System.out.println();
        }
    }
}
