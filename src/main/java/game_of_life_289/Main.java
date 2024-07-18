package game_of_life_289;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        solution.gameOfLife(board);
    }

}
