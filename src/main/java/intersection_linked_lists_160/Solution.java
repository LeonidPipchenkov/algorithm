package intersection_linked_lists_160;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int countA = countNodes(headA);
        int countB = countNodes(headB);
        if (countA > countB) {
            headA = skipNodes(headA, countA - countB);
        }
        if (countA < countB) {
            headB = skipNodes(headB, countB - countA);
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int countNodes(ListNode head) {
        int counter = 0;
        while (head != null) {
            counter++;
            head = head.next;
        }
        return counter;
    }

    private ListNode skipNodes(ListNode head, int offset) {
        for (int i = 0; i < offset; i++) {
            head = head.next;
        }
        return head;
    }

}
