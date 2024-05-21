package convert_sorted_array_108;

class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildSubBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (end + start) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = buildSubBST(nums, start, middle - 1);
        node.right = buildSubBST(nums, middle + 1, end);
        return node;
    }

}
