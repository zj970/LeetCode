/*
 * @lc app=leetcode.cn id=2651 lang=java
 * @lcpr version=30204
 *
 * [2651] 计算列车到站时间
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 15\n5\n
// @lcpr case=end

// @lcpr case=start
// 13\n11\n
// @lcpr case=end

 */

