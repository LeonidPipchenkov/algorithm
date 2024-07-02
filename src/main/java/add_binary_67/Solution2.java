package add_binary_67;

class Solution2 {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        String[] arra = a.split("");
        String[] arrb = b.split("");
        int pointerA = arra.length - 1;
        int pointerB = arrb.length - 1;
        int transition = 0;
        while (pointerA >= 0 || pointerB >= 0) {
            int numA;
            if (pointerA >= 0) {
                numA = Integer.parseInt(arra[pointerA]);
            } else {
                numA = 0;
            }
            int numB;
            if (pointerB >= 0) {
                numB = Integer.parseInt(arrb[pointerB]);
            } else {
                numB = 0;
            }
            int sum = numA + numB + transition;
            transition = 0;
            if (sum == 3) {
                sb.insert(0, 1);
                transition = 1;
            } else if (sum == 2) {
                sb.insert(0, 0);
                transition = 1;
            } else {
                sb.insert(0, sum);
            }
            pointerA--;
            pointerB--;
        }
        if (transition == 1) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }

}
