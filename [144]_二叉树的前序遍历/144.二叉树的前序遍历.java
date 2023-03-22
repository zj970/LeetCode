/*
 * @lc app=leetcode.cn id=144 lang=java
 * @lcpr version=21801
 *
 * [144] 二叉树的前序遍历
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
    public List<Integer> preorderTraversal(TreeNode root) {
        // 递归
        // List<Integer> res = new ArrayList<Integer>();
        // preorder(root,res);
        // return res;

        // 迭代
        List<Integer> res = new ArrayList<Integer>();
        if(root == null)
        {
            return res;
        }

        Deque<TreeNode> stack  = new LinkedList<TreeNode>();
        TreeNode node  = root;
        while(!stack.isEmpty() || node != null)
        {   while(node != null)
            {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }

    //  递归
    // public void preorder(TreeNode root,List<Integer> res){
    //     if  (root == null){
    //         return;
    //     }
    //     res.add(root.val);
    //     preorder(root.left,res);
    //     preorder(root.right,res);
    // }
}
// @lc code=end

// @lcpr-div-debug-arg-start
// funName=
// paramTypes= []
// returnType=
// @lcpr-div-debug-arg-end


/*
// @lcpr case=start
// [1,null,2,3]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,null,2]\n
// @lcpr case=end

 */


