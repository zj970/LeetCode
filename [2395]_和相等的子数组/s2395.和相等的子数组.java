/*
 * @lc app=leetcode.cn id=2395 lang=java
 * @lcpr version=30204
 *
 * [2395] 和相等的子数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashSet;

class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            if (!set.add(nums[i - 1] + nums[i])) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [0,0,0]\n
// @lcpr case=end

 */

