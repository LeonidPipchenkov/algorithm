package majority_element_169;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        Solution solution = new Solution();
        System.out.println(solution.majorityElement(nums));

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.majorityElement(nums));
    }

}
