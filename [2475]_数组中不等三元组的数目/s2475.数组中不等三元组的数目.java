/*
 * @lc app=leetcode.cn id=2475 lang=java
 * @lcpr version=30204
 *
 * [2475] 数组中不等三元组的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int unequalTriplets(int[] nums) {
        int count  = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int j2 = j + 1; j2 < nums.length; j2++) {
                    if (nums[i] != nums[j] && nums[i] != nums[j2] && nums[j] != nums[j2]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,4,2,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1]\n
// @lcpr case=end

 */

