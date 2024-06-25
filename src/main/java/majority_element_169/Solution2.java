package majority_element_169;

import java.util.Arrays;

class Solution2 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int half = getHalf(nums);
        int current = 0;
        int counter = 0;
        for (int num : nums) {
            if (num == current) {
                counter++;
            } else {
                if (counter >= half) {
                    return current;
                } else {
                    current = num;
                    counter = 1;
                }
            }
        }
        return current;
    }

    private int getHalf(int[] nums) {
        return nums.length % 2 == 1
                ? nums.length / 2 + 1
                : nums.length / 2;
    }

}
