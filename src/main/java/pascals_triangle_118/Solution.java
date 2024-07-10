package pascals_triangle_118;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Collections.singletonList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> previous = result.get(i - 1);
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 1; j < i; j++) {
                current.add(previous.get(j - 1) + previous.get(j));
            }
            current.add(1);
            result.add(current);
        }
        return result;
    }

}
