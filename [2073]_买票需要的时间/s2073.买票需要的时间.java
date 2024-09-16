/*
 * @lc app=leetcode.cn id=2073 lang=java
 * @lcpr version=30204
 *
 * [2073] 买票需要的时间
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                ans += Math.min(tickets[i], tickets[k]);
            } else {
                ans += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// [5,1,1,1]\n0\n
// @lcpr case=end

 */

