package add_binary_67;

class Solution {

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int aPointer = a.length() - 1;
        int bPointer = b.length() - 1;
        int carry = 0;
        while (aPointer >= 0 || bPointer >= 0) {
            int sum = carry;
            if (aPointer >= 0) {
                sum += a.charAt(aPointer) - 48;
            }
            if (bPointer >= 0) {
                sum += b.charAt(bPointer) - 48;
            }
            sb.append(sum % 2);
            carry = sum / 2;
            aPointer--;
            bPointer--;
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

}
