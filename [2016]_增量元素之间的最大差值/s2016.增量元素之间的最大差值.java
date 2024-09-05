/*
 * @lc app=leetcode.cn id=2016 lang=java
 * @lcpr version=30204
 *
 * [2016] 增量元素之间的最大差值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    ans = Math.max(ans, nums[j] - nums[i]);
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,1,5,4]\n
// @lcpr case=end

// @lcpr case=start
// [9,4,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,5,2,10]\n
// @lcpr case=end

 */

