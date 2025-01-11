/*
 * @lc app=leetcode.cn id=2609 lang=java
 * @lcpr version=30204
 *
 * [2609] 最长平衡子字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int ans = 0, pre = 0, cur = 0, n = s.length();
        for (int i = 0; i < n; i++) {
            cur++;
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i+1)) {
                if (s.charAt(i) == '1') {
                    ans = Math.max(ans, Math.min(pre, cur) * 2);
                }

                pre = cur;
                cur = 0;
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "01000111"\n
// @lcpr case=end

// @lcpr case=start
// "00111"\n
// @lcpr case=end

// @lcpr case=start
// "111"\n
// @lcpr case=end

 */

