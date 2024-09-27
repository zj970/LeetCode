/*
 * @lc app=leetcode.cn id=2144 lang=java
 * @lcpr version=30204
 *
 * [2144] 打折购买糖果的最小开销
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int minimumCost(int[] cost) {
        int total = 0;
        Arrays.sort(cost);
        for (int i = 1; i <= cost.length; i++) {
            if (i % 3!= 0) {
                total += cost[cost.length - i];
            }
        }
        return total;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [6,5,7,9,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [5,5]\n
// @lcpr case=end

 */

