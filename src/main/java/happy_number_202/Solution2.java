package happy_number_202;

import java.util.HashSet;
import java.util.Set;

class Solution2 {

    public boolean isHappy(int n) {
        Set<Integer> storage = new HashSet<>();
        int sum = 0;
        while (sum != 1 && !storage.contains(sum)) {
            storage.add(sum);
            sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }
        return sum == 1;
    }

}
