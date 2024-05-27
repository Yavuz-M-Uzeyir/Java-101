package patikaProjeler.oop.mineSweeper;

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
    int selectLine;
    int selectColumn;

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
        printBoard(map);
        System.out.println("<<<<Mayın tarlası oyununa hoş geldiniz>>>>");
        while (!isSelectMine()) {
            printBoard(board);
        }
    }

    boolean isSelectMine() {

        System.out.print("Satır : ");
        this.selectLine = inp.nextInt();

        System.out.print("Stün : ");
        this.selectColumn = inp.nextInt();

        for (int i = 0; i < this.map.length; i++) {
            for (int j = 0; j < this.map[i].length; j++) {
                if (this.map[selectLine][selectColumn].equals("*")) {
                    System.out.println("Oyunu kaybettiniz! Mayınların konumu : ");
                    printBoard(map);
                    return true;
                } else {
                    mineNumber(i, j);
                }
            }
        }
        return false;
    }

    boolean isWin() {

        return false;
    }

    int mineNumber(int line, int colmn) {

        int count = 0;
        int tempCound = 0;

        if ((colmn < this.column - 1) && (this.map[line][colmn - 1].equals("*"))) {
            this.board[line][colmn] = String.valueOf(++count);
        }
        if (this.map[line + 1][colmn - 1].equals("*")) {
            this.board[line][colmn] = String.valueOf(++count);
        }
        if (this.map[line + 1][colmn].equals("*")) {
            this.board[line][colmn] = String.valueOf(++count);
        }
        if (this.map[line + 1][colmn - 1].equals("*")) {
            this.board[line][colmn] = String.valueOf(++count);
        }
        if (this.map[line][colmn + 1].equals("*")) {
            this.board[line][colmn] = String.valueOf(++count);
        }
        if (this.map[line - 1][colmn + 1].equals("*")) {
            this.board[line][colmn] = String.valueOf(++count);
        }
        if (this.map[line - 1][colmn].equals("*")) {
            this.board[line][colmn] = String.valueOf(++count);
        }
        if (this.map[line - 1][colmn - 1].equals("*")) {
            this.board[line][colmn] = String.valueOf(++count);
        }

        tempCound = count;
        count = 0;
        return tempCound;
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
