/*
 * @lc app=leetcode.cn id=671 lang=java
 *
 * [671] 二叉树中第二小的节点
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
    //对于二叉树中任意的节点x，x的值不大于以x的根的子树中所有节点的值
    //二叉树根节点的值即为所有节点的最小值

    int ans;
    int rootValue;
    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        rootValue = root.val;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node)
    {
        if(node == null)
        {
            return;
        }
        if(ans != -1 && node.val >= ans)
        {
            return;
        }
        if(node.val > rootValue){
            ans = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
}
// @lc code=end

