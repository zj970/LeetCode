/*
 * @lc app=leetcode.cn id=1796 lang=java
 * @lcpr version=30113
 *
 * [1796] 字符串中第二大的数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int secondHighest(String s) {
        int first = -1, second = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0';
                if (digit == first || digit == second) {
                    continue;
                }
                if (digit > first) {
                    second = first;
                    first = digit;
                } else if (digit > second) {
                    second = digit;
                }
            }
        }
        return second;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "dfa12321afd"\n
// @lcpr case=end

// @lcpr case=start
// "abc1111"\n
// @lcpr case=end

 */

