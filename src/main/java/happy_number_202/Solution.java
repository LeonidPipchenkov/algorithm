package happy_number_202;

class Solution {

    public boolean isHappy(int n) {
        while (n > 6) {
            int sum = 0;
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

}
