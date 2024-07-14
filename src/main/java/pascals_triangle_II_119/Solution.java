package pascals_triangle_II_119;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = Collections.singletonList(1);
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            if (i > 1) {
                for (int j = 1; j < row.size(); j++) {
                    current.add(row.get(j - 1) + row.get(j));
                }
            }
            current.add(1);
            row = current;
        }
        return row;
    }

}
