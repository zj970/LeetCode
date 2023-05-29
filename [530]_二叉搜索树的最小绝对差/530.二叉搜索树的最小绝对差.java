/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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
/**
 * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。

差值是一个正数，其数值等于两值之差的绝对值。
 */
class Solution {
    private int minDiff = Integer.MAX_VALUE;
    private Integer prevVal = null;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return minDiff;
    }

    /**
     * 中序遍历
     * @param node
     */
    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (prevVal != null) {
            minDiff = Math.min(minDiff, node.val - prevVal);
        }
        prevVal = node.val;
        if (minDiff == 1) { // 如果差值已经是最小值 1，直接返回
            return;
        }
        dfs(node.right);
    }
}
// @lc code=end

