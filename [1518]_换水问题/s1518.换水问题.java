/*
 * @lc app=leetcode.cn id=1518 lang=java
 * @lcpr version=30111
 *
 * [1518] 换水问题
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalWalterBottles = numBottles;
        int emptyBottles = numBottles;
        while (emptyBottles >= numExchange) {
            int newWaterBottles = emptyBottles / numExchange;
            totalWalterBottles += newWaterBottles;
            emptyBottles = emptyBottles % numExchange + newWaterBottles;
        }
        return totalWalterBottles;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 9\n3\n
// @lcpr case=end

// @lcpr case=start
// 15\n4\n
// @lcpr case=end

 */

