/*
 * @lc app=leetcode.cn id=2331 lang=java
 * @lcpr version=30204
 *
 * [2331] 计算布尔二叉树的值
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null) {// 叶子节点 OR 根节点
            return root.val == 1;
        }
        if (root.val == 2) { // OR
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else { // And
            return evaluateTree(root.left) && evaluateTree(root.right);
        }
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [2,1,3,null,null,0,1]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [0]\n
 * // @lcpr case=end
 * 
 */
