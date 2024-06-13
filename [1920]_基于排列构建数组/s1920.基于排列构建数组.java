/*
 * @lc app=leetcode.cn id=1920 lang=java
 * @lcpr version=30203
 *
 * [1920] 基于排列构建数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     nums[i] += nums[nums[i]] % n * n;
        // }
        // for (int i = 0; i < n; i++) {
        //     nums[i] /= n;
        // }
        // return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,2,1,5,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [5,0,1,2,3,4]\n
// @lcpr case=end

 */

