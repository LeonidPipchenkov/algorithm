package remove_duplicates_list_83;

import java.util.Set;
import java.util.TreeSet;

class Solution2 {

    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> valSet = new TreeSet<>();
        while (head != null) {
            valSet.add(head.val);
            head = head.next;
        }
        ListNode root = null;
        ListNode actual = null;
        for (int number : valSet) {
            if (root == null) {
                root = new ListNode(number);
                actual = root;
            } else {
                actual.next = new ListNode(number);
                actual = actual.next;
            }
        }
        return root;
    }

}
