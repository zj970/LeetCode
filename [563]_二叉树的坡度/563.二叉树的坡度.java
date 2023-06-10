/*
 * @lc app=leetcode.cn id=563 lang=java
 *
 * [563] 二叉树的坡度
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

    public int findTilt(TreeNode root) {
        int[] res = new int[]{0};
        if (root != null) {
            findTiltHelper(root, res);
        }
        return res[0];
    }

    private int findTiltHelper(TreeNode root, int[] res) {
        if (root == null) {
            return 0;
        }
        int leftSum = findTiltHelper(root.left, res);
        int rightSum = findTiltHelper(root.right, res);
        res[0] += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
    }
// @lc code=end

