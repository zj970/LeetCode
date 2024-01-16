/*
 * @lc app=leetcode.cn id=1763 lang=java
 * @lcpr version=30113
 *
 * [1763] 最长的美好子字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String longestNiceSubstring(String s) {
        int n = s.length();
        int maxPos = 0;
        int maxLen = 0;
        for (int i = 0; i < n; ++i) {
            int lower = 0;
            int upper = 0;
            for (int j = i; j < n; ++j) {
                if (Character.isLowerCase(s.charAt(j))) {
                    lower |= 1 << (s.charAt(j) - 'a');
                } else {
                    upper |= 1 << (s.charAt(j) - 'A');
                }
                if (lower == upper && j - i + 1 > maxLen) {
                    maxPos = i;
                    maxLen = j - i + 1;
                }
            }
        }
        return s.substring(maxPos, maxPos + maxLen);

    }
}
// @lc code=end



/*
// @lcpr case=start
// "YazaAay"\n
// @lcpr case=end

// @lcpr case=start
// "Bb"\n
// @lcpr case=end

// @lcpr case=start
// "c"\n
// @lcpr case=end

// @lcpr case=start
// "dDzeE"\n
// @lcpr case=end

 */

