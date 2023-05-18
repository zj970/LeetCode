/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
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
 *  BST 的性质，中序遍历 BST 就可以得到一个递增的排序数组，而同一个元素在排序数组中的位置是连续的，因此我们可以维护当前元素以及它出现的次数，并记录当前出现次数最多的元素及其出现次数。当遍历到一个新元素时，如果当前元素与上一个元素相同，则出现次数加一，否则更新当前元素及其出现次数。在遍历完整个 BST 后，就可以得到出现次数最多的元素及其出现次数，然后再次遍历 BST，将出现次数等于最大出现次数的元素加入结果集合中即可。
 */
class Solution {
    private int curVal;
    private int curCnt;
    private int maxVal;
    private int maxCnt;
    private List<Integer> res = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        inOrderTraverse(root);
        curVal = 0;
        curCnt = 0;
        inOrderTraverse2(root);
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }

    private void inOrderTraverse(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse(node.left);
        if (node.val == curVal) {
            curCnt++;
        } else {
            curCnt = 1;
            curVal = node.val;
        }
        if (curCnt > maxCnt) {
            maxCnt = curCnt;
            maxVal = curVal;
        }
        inOrderTraverse(node.right);
    }

    private void inOrderTraverse2(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraverse2(node.left);
        if (node.val == curVal) {
            curCnt++;
        } else {
            curCnt = 1;
            curVal = node.val;
        }
        if (curCnt == maxCnt) {
            res.add(curVal);
        }
        inOrderTraverse2(node.right);
    }
}
// @lc code=end

