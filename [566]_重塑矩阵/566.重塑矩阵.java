/*
 * @lc app=leetcode.cn id=566 lang=java
 *
 * [566] 重塑矩阵
 */

// @lc code=start
class Solution {
    /**
     * 首先，我们计算原始矩阵的行数 m 和列数 n，判断是否能够用给定的 r 和 c 重构矩阵。
     * 如果不能，则直接返回原始矩阵 mat。
     * 接着，使用一个二重循环遍历原始矩阵，
     * 按照题目要求将所有元素以相同的行遍历顺序填充到新矩阵 res 中。
     * 具体地，使用两个变量 row 和 col 记录当前需要填充的行和列，
     * 每填充一个元素，我们将 col 加 1，如果 col 达到了 c，
     * 则将 row 加 1 并将 col 重置为 0。
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] res = new int[r][c];
        int row = 0, col = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    row++;
                    col = 0;
                }
            }
        }
        return res;
    }
}
// @lc code=end

