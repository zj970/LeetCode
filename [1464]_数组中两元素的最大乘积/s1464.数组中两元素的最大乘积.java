/*
 * @lc app=leetcode.cn id=1464 lang=java
 * @lcpr version=30111
 *
 * [1464] 数组中两元素的最大乘积
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);

        return (nums[nums.length - 1] -1) * (nums[nums.length - 2] - 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,4,5,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,5,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [3,7]\n
// @lcpr case=end

 */

