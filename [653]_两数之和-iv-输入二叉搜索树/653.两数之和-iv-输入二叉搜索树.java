/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> nums = new ArrayList<>();
        // 中序遍历得到有序数组
        inorder(root, nums);
        int left = 0, right = nums.size() - 1;
        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum == k) {
                return true;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    /**
     * norder 方法用于对二叉搜索树进行中序遍历，将得到的所有节点值存入 nums 数组中；findTarget 方法则用于寻找符合要求的两个数字。具体实现中，它设置了左右两个指针 left 和 right，分别指向数组的首尾两端，然后通过比较它们指向数字的和与目标结果 k 的大小关系来移动指针。如果找到符合要求的两个数字，则返回 true，否则返回 false。
     */
    private void inorder(TreeNode node, List<Integer> nums) {
        if (node == null) {
            return;
        }
        inorder(node.left, nums);
        nums.add(node.val);
        inorder(node.right, nums);
    }
}
// @lc code=end

