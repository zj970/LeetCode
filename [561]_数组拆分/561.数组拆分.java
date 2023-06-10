/*
 * @lc app=leetcode.cn id=561 lang=java
 *
 * [561] 数组拆分
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i+=2) {
            max += nums[i];
        }
        return max;
    }
}
// @lc code=end

