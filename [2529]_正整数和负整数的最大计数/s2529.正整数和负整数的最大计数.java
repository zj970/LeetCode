/*
 * @lc app=leetcode.cn id=2529 lang=java
 * @lcpr version=30204
 *
 * [2529] 正整数和负整数的最大计数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumCount(int[] nums) {

        int left = 0, right = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                left++;
            } else if (nums[i] > 0) {
                right++;
            }
        }
        return Math.max(left, right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-2,-1,-1,1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [-3,-2,-1,0,0,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [5,20,66,1314]\n
// @lcpr case=end

 */

