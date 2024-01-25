/*
 * @lc app=leetcode.cn id=1784 lang=java
 * @lcpr version=30113
 *
 * [1784] 检查二进制字符串字段
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1001"\n
// @lcpr case=end

// @lcpr case=start
// "110"\n
// @lcpr case=end

 */

