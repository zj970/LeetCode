/*
 * @lc app=leetcode.cn id=2639 lang=java
 * @lcpr version=30204
 *
 * [2639] 查询网格图中每一列的宽度
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[] res = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int x = grid[i][j];
                int length = 0;
                if (x <= 0) {
                    length = 1;
                }
                while (x != 0) {
                    length += 1;
                    x /= 10;
                }
                res[j] = Math.max(res[j], length);
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1],[22],[333]]\n
// @lcpr case=end

// @lcpr case=start
// [[-15,1,3],[15,7,12],[5,6,-2]]\n
// @lcpr case=end

 */

