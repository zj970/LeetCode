/*
 * @lc app=leetcode.cn id=2710 lang=java
 * @lcpr version=30204
 *
 * [2710] 移除字符串中的尾随零
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String removeTrailingZeros(String num) {
        int len = num.length();
        while (len > 0 && num.charAt(len - 1) == '0') {
            len--;
        }
        return num.substring(0, len);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "51230100"\n
// @lcpr case=end

// @lcpr case=start
// "123"\n
// @lcpr case=end

 */

