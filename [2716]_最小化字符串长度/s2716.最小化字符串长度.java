/*
 * @lc app=leetcode.cn id=2716 lang=java
 * @lcpr version=30204
 *
 * [2716] 最小化字符串长度
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimizedStringLength(String s) {
        int mask = 0;
        for(var c : s.toCharArray()) {
            mask |= 1 << (c-'a');
        }
        return Integer.bitCount(mask);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aaabc"\n
// @lcpr case=end

// @lcpr case=start
// "cbbd"\n
// @lcpr case=end

// @lcpr case=start
// "dddaaa"\n
// @lcpr case=end

 */

