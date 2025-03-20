/*
 * @lc app=leetcode.cn id=2810 lang=java
 * @lcpr version=30204
 *
 * [2810] 故障键盘
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String finalString(String s) {
        StringBuffer buffer = new StringBuffer();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == 'i') {
                buffer.reverse();
            } else {
                buffer.append(c);
            }
        }
        return buffer.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "string"\n
// @lcpr case=end

// @lcpr case=start
// "poiinter"\n
// @lcpr case=end

 */

