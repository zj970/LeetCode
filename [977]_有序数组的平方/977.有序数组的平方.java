/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        //双指针
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0, j = n - 1, pos = n - 1; i <= j;)
        {
            if (nums[i] * nums[i] > nums[j] * nums[j]){
                ans[pos--] = nums[i] * nums[i];
                ++i;
            }else{
                ans[pos--] = nums[j] * nums[j];
                --j;
            }
        }
        return ans;
    }
}
// @lc code=end

