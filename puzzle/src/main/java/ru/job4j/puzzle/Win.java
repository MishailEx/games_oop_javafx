package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = true;
        rsl = checkHorizontal(board) || checkVertical(board);
        return rsl;
    }

    public static boolean checkVertical(int[][] board) {
        boolean rsl = false;
        int column = 0;
        int counter = 0;
        while (column < board.length) {
            for (int i = 0; i < board.length; i++) {
                if (counter == board.length) {
                    i = board.length - 1;
                    rsl = true;
                    break;
                }
                if (board[i][column] == 0) {
                    break;
                } else if (board[i][column] != 0) {
                    counter++;
                }
            }
            column++;
        }
        return rsl;
    }

    public static boolean checkHorizontal(int[][] board) {
        boolean rsl = false;
        int counter = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (counter == board.length){
                        rsl = true;
                        i = board.length - 1;
                        break;
                    }
                    if (board[i][j] == 0){
                        counter = 0;
                        break;
                    }else if (board[i][j] != 0){
                        counter++;
                    }
                }
        }
        return rsl;
    }
}



