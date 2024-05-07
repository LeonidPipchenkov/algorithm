package length_last_word_58;

class Solution2 {

    public int lengthOfLastWord(String s) {
        String[] words = s.split("\s+");
        String last = words[words.length - 1];
        return last.length();
    }

}
