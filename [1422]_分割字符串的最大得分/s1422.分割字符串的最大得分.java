/*
 * @lc app=leetcode.cn id=1422 lang=java
 * @lcpr version=30111
 *
 * [1422] 分割字符串的最大得分
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxScore(String s) {
        int n = s.length(), ans = 0;
        int[] sum = new int[n + 10];
        for (int i = 1; i <= n; i++) sum[i] = sum[i - 1] + (s.charAt(i - 1) - '0');
        for (int i = 1; i <= n - 1; i++) {
            int a = i - sum[i], b = sum[n] - sum[i];
            ans = Math.max(ans, a + b);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "011101"\n
// @lcpr case=end

// @lcpr case=start
// "00111"\n
// @lcpr case=end

// @lcpr case=start
// "1111"\n
// @lcpr case=end

 */

