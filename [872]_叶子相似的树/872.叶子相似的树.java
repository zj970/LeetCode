/*
 * @lc app=leetcode.cn id=872 lang=java
 *
 * [872] 叶子相似的树
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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seql = new ArrayList<Integer>();
        if(root1 != null)
        {
            dfs(root1,seql);
        }

        List<Integer> seq2 = new ArrayList<Integer>();
        if(root2 != null)
        {
            dfs(root2,seq2);
        }

        return seql.equals(seq2);
    }

    public void dfs(TreeNode node, List<Integer> seq)
    {
        if(node.left == null && node.right == null)
        {
            seq.add(node.val);
        }else{
            if(node.left != null)
            {
                dfs(node.left, seq);
            }
            if(node.right != null)
            {
                dfs(node.right, seq);
            }
        }
    }
}
// @lc code=end

