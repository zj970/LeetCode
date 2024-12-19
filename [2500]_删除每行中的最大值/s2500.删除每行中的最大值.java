/*
 * @lc app=leetcode.cn id=2500 lang=java
 * @lcpr version=30204
 *
 * [2500] 删除每行中的最大值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m  = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            Arrays.sort(grid[i]);
        }

        int res = 0;
        for (int j = 0; j < n; j++) {
            int max = 0;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, grid[i][j]);
            }
            res += max;
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,4],[3,3,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[10]]\n
// @lcpr case=end

 */

