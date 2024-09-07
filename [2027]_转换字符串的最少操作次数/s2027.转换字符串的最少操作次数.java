/*
 * @lc app=leetcode.cn id=2027 lang=java
 * @lcpr version=30204
 *
 * [2027] 转换字符串的最少操作次数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumMoves(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                ans++;
                i += 2;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "XXX"\n
// @lcpr case=end

// @lcpr case=start
// "XXOX"\n
// @lcpr case=end

// @lcpr case=start
// "OOOO"\n
// @lcpr case=end

 */

