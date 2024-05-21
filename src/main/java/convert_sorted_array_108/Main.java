package convert_sorted_array_108;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode result = solution.sortedArrayToBST(nums);
        System.out.println(buildOut(result));
    }

    private static List<Integer> buildOut(TreeNode treeNode) {
        List<Integer> outList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                outList.add(current.val);
                if (current.left != null || current.right != null) {
                    queue.add(current.left);
                    queue.add(current.right);
                }
            } else {
                outList.add(null);
            }
        }
        return outList;
    }

}
