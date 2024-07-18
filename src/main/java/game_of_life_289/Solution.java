package game_of_life_289;

import java.util.Arrays;

class Solution {

    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] initial = new int[m][n];
        for (int x = 0; x < m; x++) {
            initial[x] = board[x].clone();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int alive = countAlive(initial, i, j, m, n);
                if (board[i][j] == 1) {
                    if (alive < 2) {
                        board[i][j] = 0;
                    }
                    if (alive == 2 || alive == 3) {
                        board[i][j] = 1;
                    }
                    if (alive > 3) {
                        board[i][j] = 0;
                    }
                }
                if (board[i][j] == 0 && alive == 3) {
                    board[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(initial));
        System.out.println(Arrays.deepToString(board));
    }

    private int countAlive(int[][] board, int i, int j, int m, int n) {
        int counter = 0;
        for (int r = Math.max(i - 1, 0); r <= Math.min(i + 1, m - 1); r++) {
            for (int c = Math.max(j - 1, 0); c <= Math.min(j + 1, n - 1); c++) {
                if (r == i && c == j) {
                    continue;
                }
                if (board[r][c] == 1) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
