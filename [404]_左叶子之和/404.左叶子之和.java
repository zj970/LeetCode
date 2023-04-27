/*
 * @lc app=leetcode.cn id=404 lang=java
 * @lcpr version=21907
 *
 * [404] 左叶子之和
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
 * 一个节点为「左叶子」节点，当且仅当它是某个节点的左子节点，并且它是一个叶子结点。因此我们可以考虑对整棵树进行遍历，当我们遍历到节点 {node}node 时，如果它的左子节点是一个叶子结点，那么就将它的左子节点的值累加计入答案。
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    public int dfs(TreeNode node){
        int ans = 0;
        if(node.left!=null){
            ans+=isLeafNode(node.left) ? node.left.val : dfs(node.left);
        }
        if(node.right!=null && !isLeafNode(node.right)){
            ans += dfs(node.right);
        }
        return ans;
    }

    public boolean isLeafNode(TreeNode node){
        return node.left == null && node.right == null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,9,20,null,null,15,7]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

