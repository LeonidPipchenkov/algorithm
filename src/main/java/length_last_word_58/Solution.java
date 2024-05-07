package length_last_word_58;

class Solution {

    public int lengthOfLastWord(String s) {
        int count = 0;
        char current;
        int index = s.length() - 1;
        while (index >= 0) {
            current = s.charAt(index);
            if (current == ' ' && count > 0) {
                break;
            }
            if (current != ' ') {
                count++;
            }
            index--;
        }
        return count;
    }

}
