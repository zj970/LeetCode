/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
//深度优先搜索
//如果当前节点不是叶子节点，则在当前的路径末尾添加该节点，并继续递归遍历该节点的每一个孩子节点。 
//如果当前节点是叶子节点，则在当前路径末尾添加该节点后我们就得到了一条从根节点到叶子节点的路径，将该路径加入到答案即可。
// class Solution {
//     public List<String> binaryTreePaths(TreeNode root) {
//         List<String> paths = new ArrayList<String>();
//         constructPaths(root,"",paths);
//         return paths;
//     }

//     public void constructPaths(TreeNode root, String path, List<String> paths)
//     {
//         if(root != null)
//         {
//             StringBuffer pathSB = new StringBuffer(path);
//             pathSB.append(Integer.toString(root.val));

//             if(root.left == null && root.right == null)
//             {
//                 //当前节点没有子节点，吧路径加入到答案中
//                 paths.add(pathSB.toString());
//             } else
//             {
//                 pathSB.append("->");//当前节点不是叶子节点，继续递归遍历
//                 constructPaths(root.left,pathSB.toString(),paths);
//                 constructPaths(root.right,pathSB.toString(),paths);
//             }
//         }
//     }
// }


/**
 * 广度优先搜索
 * 我们维护一个队列，存储节点以及根到该节点的路径。一开始这个队列里只有根节点。
 * 在每一步迭代中，我们取出队列中的首节点，如果它是叶子节点，则将它对应的路径加入到答案中。
 * 如果它不是叶子节点，则将它的所有孩子节点加入到队列的末尾。
 * 当队列为空的时候广度优先搜索结束，得到答案
 */

class Solution{

    public List<String> binaryTreePaths(TreeNode root)
    {
        List<String> paths = new ArrayList<String>();

        if(root == null)
        {
            return paths;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        Queue<String> pathQueue = new LinkedList<String>();

        nodeQueue.offer(root);
        pathQueue.offer(Integer.toString(root.val));

        while(!nodeQueue.isEmpty())
        {
            TreeNode node = nodeQueue.poll();
            String path = pathQueue.poll();

            if(node.left == null && node.right == null)
            {
                paths.add(path);
            }else
            {
                if(node.left != null)
                {
                    nodeQueue.offer(node.left);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.left.val).toString());
                }

                if(node.right != null)
                {
                    nodeQueue.offer(node.right);
                    pathQueue.offer(new StringBuffer(path).append("->").append(node.right.val).toString());
                }

            }
        }

        return paths;

    }    
}

// @lc code=end

