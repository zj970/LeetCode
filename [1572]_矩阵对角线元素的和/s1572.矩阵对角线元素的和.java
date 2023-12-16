/*
 * @lc app=leetcode.cn id=1572 lang=java
 * @lcpr version=30112
 *
 * [1572] 矩阵对角线元素的和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (i == j || i + j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[4,5,6],[7,8,9]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1,1],[1,1,1,1],[1,1,1,1],[1,1,1,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[5]]\n
// @lcpr case=end

 */

