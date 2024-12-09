/*
 * @lc app=leetcode.cn id=2441 lang=java
 * @lcpr version=30204
 *
 * [2441] 与对应负数同时存在的最大正整数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {
        int slow = nums.length - 1;
        Arrays.sort(nums);
        for (; slow >= 1; slow--) {
            for (int fast = 0; fast < slow; fast++) {
                if (nums[slow] == -nums[fast]) {
                    return nums[slow];
                }
            }
        }

        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-1,2,-3,3]\n
// @lcpr case=end

// @lcpr case=start
// [-1,10,6,7,-7,1]\n
// @lcpr case=end

// @lcpr case=start
// [-10,8,6,7,-2,-3]\n
// @lcpr case=end

 */

