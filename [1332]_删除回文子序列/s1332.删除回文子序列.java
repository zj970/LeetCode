/*
 * @lc app=leetcode.cn id=1332 lang=java
 * @lcpr version=30110
 *
 * [1332] 删除回文子序列
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; ++i) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return 2;
            }
        }
        return 1;
    }
}
// @lc code=end
/*
// @lcpr case=start
// "ababa"\n
// @lcpr case=end

// @lcpr case=start
// "abb"\n
// @lcpr case=end

// @lcpr case=start
// "baabb"\n
// @lcpr case=end

 */

