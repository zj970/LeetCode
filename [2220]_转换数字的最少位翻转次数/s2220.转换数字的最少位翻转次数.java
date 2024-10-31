/*
 * @lc app=leetcode.cn id=2220 lang=java
 * @lcpr version=30204
 *
 * [2220] 转换数字的最少位翻转次数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minBitFlips(int start, int goal) {
        int orVal = start | goal;
        int andVal = start & goal;
        return Integer.bitCount(orVal) - Integer.bitCount(andVal);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 10\n7\n
// @lcpr case=end

// @lcpr case=start
// 3\n4\n
// @lcpr case=end

 */

