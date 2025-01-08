/*
 * @lc app=leetcode.cn id=2574 lang=java
 * @lcpr version=30204
 *
 * [2574] 左右元素和的差值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int[] ans = new int[nums.length];
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(sum - temp -nums[i] -temp);
            temp += nums[i];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [10,4,8,3]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

