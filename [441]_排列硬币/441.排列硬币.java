/*
 * @lc app=leetcode.cn id=441 lang=java
 * @lcpr version=21907
 *
 * [441] 排列硬币
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        return  (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n
// @lcpr case=end

// @lcpr case=start
// 8\n
// @lcpr case=end

 */

