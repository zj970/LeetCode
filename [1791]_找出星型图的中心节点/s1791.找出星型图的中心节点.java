/*
 * @lc app=leetcode.cn id=1791 lang=java
 * @lcpr version=30113
 *
 * [1791] 找出星型图的中心节点
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0], b = edges[0][1];
        if (a == edges[1][0] || a == edges[1][1]) return a;
        else return b;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[2,3],[4,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,2],[5,1],[1,3],[1,4]]\n
// @lcpr case=end

 */

