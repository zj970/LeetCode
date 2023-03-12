import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=101 lang=java
 * @lcpr version=21801
 *
 * [101] 对称二叉树
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
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    boolean check(TreeNode right, TreeNode left) {
        if (right == null && left == null) {
            return true;
        }
        if (right == null || left == null) {
            return false;
        }

        return right.val == left.val && check(right.left, left.right) && check(right.right, left.left);
    }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end

/*
 * // @lcpr case=start
 * // [1,2,2,3,4,4,3]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,2,2,null,3,null,3]\n
 * // @lcpr case=end
 * 
 */
