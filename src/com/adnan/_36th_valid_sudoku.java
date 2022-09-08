package com.adnan;

public class _36th_valid_sudoku {
    public static void main(String[] args) {

    }
    // slow solution
//     public boolean isValidSudoku(char[][] board) {

//         HashSet<String> set = new HashSet();
//         for (int i=0; i<9; i++){
//             for(int j=0; j<9; j++){
//                 char cur = board[i][j];
//                 if (cur!='.'){
//                     if(!set.add(cur + "in row" + i) ||
//                        !set.add(cur + "in col" + j) ||
//                        !set.add(cur + "in box" + i/3 + "," +j/3)){
//                           return false;
//                     }
//                 }
//             }
//         }
//         return true;

//     }

    // fastest solution
    public boolean isValidSudoku(char[][] board) {
        // Base case...
        if (board == null || board.length != 9 || board[0].length != 9)
            return false;

        //For each column check that their is repeatation of any digit present in filled cells...
        for (int i = 0; i < 9; i++) {
            boolean[] set = new boolean[9];
            for (int j = 0; j < 9; j++) {
                // For filled cells only...
                if (board[i][j] != '.') {
                    // That number-1, is its index in every checking array...
                    if (set[(int) (board[i][j] - '1')]) {
                        return false;
                    }
                    set[(int) (board[i][j] - '1')] = true;
                }
            }
        }

        // For each row check that their is repeatation of any digit present in filled cells...
        for (int j = 0; j < 9; j++) {
            boolean[] set = new boolean[9];
            for (int i = 0; i < 9; i++) {
                // For filled cells only
                if (board[i][j] != '.') {
                    // That number-1, is its index in every checking array...
                    if (set[(int) (board[i][j] - '1')]) {
                        return false;
                    }
                    set[(int) (board[i][j] - '1')] = true;
                }
            }
        }

        // Check that every 3*3 grid must contain different values means no repeatation of any digit present in filled cells...
        for (int grid = 0; grid < 9; grid++) {
            boolean[] set = new boolean[9];
            // Traverse each grid through the loops...
            for (int i = grid / 3 * 3; i < grid / 3 * 3 + 3; i++) {
                for (int j = grid % 3 * 3; j < grid % 3 * 3 + 3; j++) {
                    // For filled cells only...
                    if (board[i][j] != '.') {
                        // That number-1, is its index in every checking array
                        if (set[(int) (board[i][j] - '1')]) {
                            return false;
                        }
                        set[(int) (board[i][j] - '1')] = true;
                    }
                }
            }
        }
        return true;
    }
}
