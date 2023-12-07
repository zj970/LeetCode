/*
 * @lc app=leetcode.cn id=1480 lang=java
 * @lcpr version=30111
 *
 * [1480] 一维数组的动态和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        int sum = 0;

        for (int i = 0; i <= nums.length - 1; ++i) {
            sum += nums[i];
            // for (int j = 0; j <= i; ++j) {
            //     sum += nums[j];
            // }
            // res[i] = sum;
        }
        for(int i = nums.length - 1; i > 0 ; i--) {
            res[i] = sum;
            sum -= nums[i];
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [3,1,2,10,1]\n
// @lcpr case=end

 */

