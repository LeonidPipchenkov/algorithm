package relative_ranks_506;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] score = {10, 3, 8, 9, 4};
        String[] answer = solution.findRelativeRanks(score);
        System.out.println(Arrays.toString(answer));
    }

}
