package patikaProjeler.mineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner inp = new Scanner(System.in);
    int line;
    int column;
    int selectLine;
    int selectColumn;
    int randomLine;
    int randomColumn;
    int mine;
    String[][] board;
    String[][] map;
    Random rand = new Random();

    MineSweeper(int line, int column) {

        if (line >= 2 && column >= 2) {

            this.selectLine = -1;
            this.selectColumn = -1;
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

    void plantMine() {

        int i = 0;
        while (i < this.mine) {
            this.randomLine = rand.nextInt(this.line);
            this.randomColumn = rand.nextInt(this.column);
            if (this.map[randomLine][randomColumn].equals("-")) {
                this.map[randomLine][randomColumn] = "*";
                i++;
            }
        }

    }

    boolean isSelectMine() {

        if (this.selectLine == this.randomLine || this.selectColumn == this.randomColumn) {
            return true;
        }
        return false;

    }

    void play() {

        System.out.println("radom line "+this.randomLine);
        System.out.println("random colon "+this.randomColumn);

        plantMine();
        printBoard(map);
        System.out.println("<<<Mayın tarlası oyununa hoş geldiniz>>>");
        while (!isSelectMine()) {
            System.out.print("Satır giriniz : ");
            this.selectLine = inp.nextInt();
            System.out.print("Stün giriniz : ");
            this.selectColumn = inp.nextInt();
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
