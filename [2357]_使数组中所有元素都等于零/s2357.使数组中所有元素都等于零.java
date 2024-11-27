/*
 * @lc app=leetcode.cn id=2357 lang=java
 * @lcpr version=30204
 *
 * [2357] 使数组中所有元素都等于零
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] stats = new boolean[101];
        stats[0] = true;
        int ans = 0;
        for (int num : nums) {
            if (!stats[num]) {
                ++ans;
                stats[num] = true;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,5,0,3,5]\n
// @lcpr case=end

// @lcpr case=start
// [0]\n
// @lcpr case=end

 */

