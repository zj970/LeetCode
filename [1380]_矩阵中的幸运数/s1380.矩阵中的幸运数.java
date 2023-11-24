/*
 * @lc app=leetcode.cn id=1380 lang=java
 * @lcpr version=30110
 *
 * [1380] 矩阵中的幸运数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean isMin = true, isMax = true;
                for (int k = 0; k < n; k++) {
                    if (matrix[i][k] < matrix[i][j]) {
                        isMin = false;
                        break;
                    }
                }
                if (!isMin) {
                    continue;
                }
                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] > matrix[i][j]) {
                        isMax = false;
                        break;
                    }
                }
                if (isMax) {
                    ret.add(matrix[i][j]);
                }
            }
        }
        return ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[3,7,8],[9,11,13],[15,16,17]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,10,4,2],[9,3,8,7],[15,16,17,12]]\n
// @lcpr case=end

// @lcpr case=start
// [[7,8],[1,2]]\n
// @lcpr case=end

 */

