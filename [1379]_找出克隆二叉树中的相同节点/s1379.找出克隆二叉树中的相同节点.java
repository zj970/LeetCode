/*
 * @lc app=leetcode.cn id=1379 lang=java
 * @lcpr version=30110
 *
 * [1379] 找出克隆二叉树中的相同节点
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
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode node;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }
        if (cloned == null) {
            return original;
        }
        preOrder(cloned, target.val);

        return node;
    }
    
    private void preOrder(TreeNode root, int target){
        if (root == null) {
            return;
        }
        if (root.val == target) {
            node = root;
            return;
        }
        
        preOrder(root.left, target);
        preOrder(root.right, target);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,4,3,null,null,6,19]\n3\n
// @lcpr case=end

// @lcpr case=start
// [7]\n7\n
// @lcpr case=end

// @lcpr case=start
// [8,null,6,null,5,null,4,null,3,null,2,null,1]\n4\n
// @lcpr case=end

 */

