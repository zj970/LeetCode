/*
 * @lc app=leetcode.cn id=589 lang=java
 *
 * [589] N 叉树的前序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
            List<Integer> res = new ArrayList<>();
            if(root == null)
            {
                return res;
            }
            res.add(root.val);
            for(Node child : root.children)
            {
                res.addAll(preorder(child));
            }
            return res;
    }
}
// @lc code=end

