/*
 * @lc app=leetcode.cn id=2236 lang=java
 * @lcpr version=30204
 *
 * [2236] 判断根结点是否等于子结点之和
 */


// @lcpr-template-start

// @lcpr-template-end
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
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,4,6]\n
// @lcpr case=end

// @lcpr case=start
// [5,3,1]\n
// @lcpr case=end

 */

