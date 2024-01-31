/*
 * @lc app=leetcode.cn id=1827 lang=java
 * @lcpr version=30114
 *
 * [1827] 最少操作使数组递增
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minOperations(int[] nums) {
        int ans = 0, mx = 0;
        for (int v : nums) {
            ans += Math.max(0, mx + 1 - v);
            mx = Math.max(mx + 1, v);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,5,2,4,1]\n
// @lcpr case=end

// @lcpr case=start
// [8]\n
// @lcpr case=end

 */

