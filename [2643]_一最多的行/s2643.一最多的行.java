/*
 * @lc app=leetcode.cn id=2643 lang=java
 * @lcpr version=30204
 *
 * [2643] 一最多的行
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        // 记录行号
        int rsRowNo = 0;
        int onesCnt = 0;
        // 两层循环，遍历二维数组
        for (int i = 0; i < mat.length; i++) {
            // 统计当前行1的个数
            int tmpOnesCnt = 0;
            for (int j : mat[i]) {
                if (j == 1) {
                    tmpOnesCnt++;
                }
            }
            // 求最大值
            if (tmpOnesCnt > onesCnt) {
                onesCnt = tmpOnesCnt;
                rsRowNo = i;
            }
        }
        
        return new int[]{rsRowNo, onesCnt};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1],[1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,0],[0,1,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0],[1,1],[0,0]]\n
// @lcpr case=end

 */

