package remove_duplicates_list_83;

public class Main {

    public static void main(String[] args) {
        ListNode node3 = new ListNode(2);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);

        Solution solution = new Solution();
        ListNode head = solution.deleteDuplicates(node1);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        Solution2 solution2 = new Solution2();
        ListNode head2 = solution2.deleteDuplicates(node1);
        while (head2 != null) {
            System.out.println(head2.val);
            head2 = head2.next;
        }
    }

}
