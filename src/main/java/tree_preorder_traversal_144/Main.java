package tree_preorder_traversal_144;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node = new TreeNode(1, null, node2);
        System.out.println(solution.preorderTraversal(node));
    }

}
