package happy_number_202;

class Solution3 {

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 7) {
            return false;
        }
        n = sumOfSquares(n);
        return isHappy(n);
    }

    private int sumOfSquares(int n) {
        int result = 0;
        String sn = String.valueOf(n);
        String[] arr = sn.split("");
        for (String snum : arr) {
            int number = Integer.parseInt(snum);
            result += number * number;
        }
        return result;
    }

}
