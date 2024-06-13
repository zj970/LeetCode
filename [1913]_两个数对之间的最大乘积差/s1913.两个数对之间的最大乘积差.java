/*
 * @lc app=leetcode.cn id=1913 lang=java
 * @lcpr version=30203
 *
 * [1913] 两个数对之间的最大乘积差
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,6,2,7,4]\n
// @lcpr case=end

// @lcpr case=start
// [4,2,5,9,7,4,8]\n
// @lcpr case=end

 */

