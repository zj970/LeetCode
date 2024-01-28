/*
 * @lc app=leetcode.cn id=1800 lang=java
 * @lcpr version=30113
 *
 * [1800] 最大升序子数组和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0], sum = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            if (nums[i] > nums[i - 1]) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,20,30,5,10,50]\n
// @lcpr case=end

// @lcpr case=start
// [10,20,30,40,50]\n
// @lcpr case=end

// @lcpr case=start
// [12,17,15,13,10,11,12]\n
// @lcpr case=end

// @lcpr case=start
// [100,10,1]\n
// @lcpr case=end

 */

