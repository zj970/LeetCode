/*
 * @lc app=leetcode.cn id=1523 lang=java
 * @lcpr version=30111
 *
 * [1523] 在区间范围内统计奇数数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countOdds(int low, int high) {
        if (high % 2 != 0 && low %2 != 0) {
            return (high - low + 1) / 2 + 1;
        }
        return  (high - low + 1) / 2;
        //超出时间限制
        //sreturn (int) IntStream.rangeClosed(low,high).filter(i -> i % 2 != 0).count();
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n7\n
// @lcpr case=end

// @lcpr case=start
// 8\n10\n
// @lcpr case=end

 */

