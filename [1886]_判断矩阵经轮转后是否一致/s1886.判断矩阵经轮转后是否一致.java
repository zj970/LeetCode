/*
 * @lc app=leetcode.cn id=1886 lang=java
 * @lcpr version=30122
 *
 * [1886] 判断矩阵经轮转后是否一致
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int total = n * n;
        for (int times = 0; times < 4; times++) {
            boolean flag = true;
            for (int i = 0; i < total && flag; i++) {
                int[] pos = {i / n, i % n};
                int[] rotatedPos = getRotatedPos(pos, n, times);
                if (mat[pos[0]][pos[1]] != target[rotatedPos[0]][rotatedPos[1]]) {
                    flag = false;
                }
            }
            if (flag) {
                return true;
            }
        }
        return false;
    }

    public int[] getRotatedPos(int[] pos, int n, int times) {
        int row = pos[0], col = pos[1];
        for (int i = 1; i <= times; i++) {
            int newRow = col;
            int newCol = n - 1 - row;
            row = newRow;
            col = newCol;
        }
        return new int[]{row, col};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[0,1],[1,0]]\n[[1,0],[0,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,1],[1,1]]\n[[1,0],[0,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,0],[0,1,0],[1,1,1]]\n[[1,1,1],[0,1,0],[0,0,0]]\n
// @lcpr case=end

 */

