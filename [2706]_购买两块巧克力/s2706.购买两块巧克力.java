/*
 * @lc app=leetcode.cn id=2706 lang=java
 * @lcpr version=30204
 *
 * [2706] 购买两块巧克力
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int res = money - prices[0] - prices[1];
        return res >= 0 ? res : money;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2]\n3\n
// @lcpr case=end

// @lcpr case=start
// [3,2,3]\n3\n
// @lcpr case=end

 */

