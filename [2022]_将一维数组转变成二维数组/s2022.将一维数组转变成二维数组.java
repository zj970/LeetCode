/*
 * @lc app=leetcode.cn id=2022 lang=java
 * @lcpr version=30204
 *
 * [2022] 将一维数组转变成二维数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }

        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = original[i * n + j];
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n2\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n1\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n1\n1\n
// @lcpr case=end

// @lcpr case=start
// [3]\n1\n2\n
// @lcpr case=end

 */

