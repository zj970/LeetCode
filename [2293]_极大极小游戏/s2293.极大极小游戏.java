/*
 * @lc app=leetcode.cn id=2293 lang=java
 * @lcpr version=30204
 *
 * [2293] 极大极小游戏
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minMaxGame(int[] nums) {
        for (int n = nums.length; n > 1; n /= 2) {
            for (int j = 0; j < n / 2; ++j) {
                if (j % 2 == 1) {
                    nums[j] = Math.max(nums[2 * j], nums[2 * j + 1]);
                } else {
                    nums[j] = Math.min(nums[2 * j], nums[2 * j + 1]);
                }
            }
        }
        return nums[0];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,5,2,4,8,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [3]\n
// @lcpr case=end

 */

