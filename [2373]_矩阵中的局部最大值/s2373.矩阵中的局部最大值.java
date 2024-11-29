/*
 * @lc app=leetcode.cn id=2373 lang=java
 * @lcpr version=30204
 *
 * [2373] 矩阵中的局部最大值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][];
        for (int i = 0; i < n - 2; i++) {
            maxLocal[i] = new int[n - 2];
        }
        for (int i = 0, rowEnd = 2; rowEnd < n; i++, rowEnd++) {
            for (int j = 0, colEnd = 2; colEnd < n; j++, colEnd++) {
                for (int row = i; row <= rowEnd; row++) {
                    for (int col = j; col <= colEnd; col++) {
                        maxLocal[i][j] = Math.max(maxLocal[i][j], grid[row][col]);
                    }
                }
            }
        }
        return maxLocal;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1,1,1],[1,1,1,1,1],[1,1,2,1,1],[1,1,1,1,1],[1,1,1,1,1]]\n
// @lcpr case=end

 */

