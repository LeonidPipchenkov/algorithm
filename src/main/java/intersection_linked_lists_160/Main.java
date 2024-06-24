package intersection_linked_lists_160;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode common1 = new ListNode(8);
        ListNode common2 = new ListNode(4);
        ListNode common3 = new ListNode(5);
        common1.next = common2;
        common2.next = common3;

        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        b1.next = b2;
        b2.next = b3;
        b3.next = common1;

        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        a1.next = a2;
        a2.next = common1;

        ListNode result = solution.getIntersectionNode(a1, b1);

        System.out.println(Objects.nonNull(result) ? result.val : null);
    }

}
