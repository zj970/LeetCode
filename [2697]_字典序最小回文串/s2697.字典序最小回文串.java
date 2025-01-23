/*
 * @lc app=leetcode.cn id=2697 lang=java
 * @lcpr version=30204
 *
 * [2697] 字典序最小回文串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String makeSmallestPalindrome(String s) {
        var array = s.toCharArray();
        for (int i = 0, n = array.length; i < n / 2; i++) {
            char x = array[i], y = array[n - 1 - i];
            if (x > y) array[i] = y;
            else array[n - 1 - i] = x;
        }
        return new String(array);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "egcfe"\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n
// @lcpr case=end

// @lcpr case=start
// "seven"\n
// @lcpr case=end

 */

