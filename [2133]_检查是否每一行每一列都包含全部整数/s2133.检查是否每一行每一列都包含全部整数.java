/*
 * @lc app=leetcode.cn id=2133 lang=java
 * @lcpr version=30204
 *
 * [2133] 检查是否每一行每一列都包含全部整数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            // 用哈希表同时检查第i+1行，第i+1列
            int row[] = new int[n+1];
            int col[] = new int[n+1];
            for (int j = 0; j < n; j++) {
                // 只要行或者列出现重复即无效
                if ((++row[matrix[i][j]]) > 1) return false;
                if ((++col[matrix[j][i]]) > 1) return false; 
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[3,1,2],[2,3,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1,1],[1,2,3],[1,2,3]]\n
// @lcpr case=end

 */

