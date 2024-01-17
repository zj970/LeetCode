/*
 * @lc app=leetcode.cn id=1758 lang=java
 * @lcpr version=30113
 *
 * [1758] 生成交替二进制字符串的最少操作数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minOperations(String s) {
        int ops0 = 0, ops1 = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0 ^ s.charAt(i) == '0') {
                ops0++;
            } else {
                ops1++;
            }
        }
        return Math.min(ops0, ops1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "0100"\n
// @lcpr case=end

// @lcpr case=start
// "10"\n
// @lcpr case=end

// @lcpr case=start
// "1111"\n
// @lcpr case=end

 */

