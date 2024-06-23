package magnetic_force_between_1552;

import java.util.Arrays;

class Solution {

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 1;
        int r = position[position.length - 1] - position[0];
        while (l < r) {
            int mid = r - (r - l) / 2;
            if (mumBalls(position, mid) >= m) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private int mumBalls(int[] position, int force) {
        int balls = 0;
        int prevPosition = -force;
        for (int pos : position) {
            if (pos - prevPosition >= force) {
                balls++;
                prevPosition = pos;
            }
        }
        return balls;
    }

}
