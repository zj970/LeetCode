/*
 * @lc app=leetcode.cn id=2224 lang=java
 * @lcpr version=30204
 *
 * [2224] 转化时间需要的最少操作数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int convertTime(String current, String correct) {
        int time1 = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3));
        int time2 = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3));
        // 需要增加的分钟数
        int diff = time2 - time1;
        // 尽可能优先使用增加数值更大的操作
        int[] ops = {60, 15, 5, 1};
        int res = 0;
        for (int t : ops) {
            res += diff / t;
            diff %= t;
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "02:30"\n"04:35"\n
// @lcpr case=end

// @lcpr case=start
// "11:00"\n"11:01"\n
// @lcpr case=end

 */

