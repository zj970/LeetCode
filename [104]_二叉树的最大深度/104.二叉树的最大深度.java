/*
 * @lc app=leetcode.cn id=104 lang=java
 * @lcpr version=21801
 *
 * [104] 二叉树的最大深度
 */

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
 * 
 * Where this
 * TreeNode.left == null && TreeNode.right == null
 * return maxDepth;
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return root == null ? 0: Math.max(this.maxDepth(root.left), this.maxDepth(root.right))+1;
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end
