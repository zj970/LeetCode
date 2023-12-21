/*
 * @lc app=leetcode.cn id=1582 lang=java
 * @lcpr version=30112
 *
 * [1582] 二进制矩阵中的特殊位置
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] rowsSum = new int[m];
        int[] colsSum = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rowsSum[i] += mat[i][j];
                colsSum[j] += mat[i][j];
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1 && rowsSum[i] == 1 && colsSum[j] == 1) {
                    res++;
                }
            }
        }
        return res;
    }

}
// @lc code=end



/*
// @lcpr case=start
// [[1,0,0],[0,0,1],[1,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,0,0],[0,1,0],[0,0,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,0,1],[1,0,0,0],[0,1,1,0],[0,0,0,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,0,0,0],[1,0,0,0,0],[0,1,0,0,0],[0,0,1,0,0],[0,0,0,1,1]]\n
// @lcpr case=end

 */

