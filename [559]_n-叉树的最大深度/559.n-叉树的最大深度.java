/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N 叉树的最大深度
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
    public int maxDepth(Node root) {
        if(root == null)
        {
            return 0;
        }
        else if (root.children.isEmpty())
        {
            //如果没有叶子结点，则返回深度1
            return 1;
        }
        else{
            int maxDepth = 0;
            //遍历所有的叶子结点的最大值
            for(Node child : root.children)
            {
                maxDepth = Math.max(maxDepth,maxDepth(child));
            }
            return maxDepth + 1;//加上根结点
        }
    }
}
// @lc code=end

