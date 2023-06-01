/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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
 * 给你一棵二叉树的根节点，返回该树的 直径 。

二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。

两节点之间路径的 长度 由它们之间边数表示。
 * @param root
 * @return
 */ 
class Solution {
    int diameter;

    /**
     * 度优先搜索（DFS）求解二叉树的直径。对于二叉树的每个节点，我们可以计算出以该节点为根的子树的深度（即该节点到叶子节点的最长路径的长度），然后以该节点为中心，计算经过该节点的最长路径长度。最终的二叉树直径即为所有节点的最长路径长度的最大值。
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        dfs(root);
        return diameter;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
// @lc code=end

