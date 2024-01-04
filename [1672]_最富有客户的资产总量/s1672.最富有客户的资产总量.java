/*
 * @lc app=leetcode.cn id=1672 lang=java
 * @lcpr version=30112
 *
 * [1672] 最富有客户的资产总量
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                temp += accounts[i][j];
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2,3],[3,2,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,5],[7,3],[3,5]]\n
// @lcpr case=end

// @lcpr case=start
// [[2,8,7],[7,1,3],[1,9,5]]\n
// @lcpr case=end

 */

