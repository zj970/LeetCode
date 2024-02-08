/*
 * @lc app=leetcode.cn id=1876 lang=java
 * @lcpr version=30116
 *
 * [1876] 长度为三且各字符不同的子字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countGoodSubstrings(String s) {
        int length = s.length();
        if (length < 3) {
            return 0;
        }
        int good = 0;
        for (int i = 2; i < length; i++) {
            char c0 = s.charAt(i - 2), c1 = s.charAt(i - 1), c2 = s.charAt(i);
            if (c0 != c1 && c1 != c2 && c0 != c2) {
                good++;
            }
        }
        return good;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "xyzzaz"\n
// @lcpr case=end

// @lcpr case=start
// "aababcabc"\n
// @lcpr case=end

 */

