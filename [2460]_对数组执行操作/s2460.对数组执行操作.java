/*
 * @lc app=leetcode.cn id=2460 lang=java
 * @lcpr version=30204
 *
 * [2460] 对数组执行操作
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] applyOperations(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i+1] = 0; 
            }
        }

        int[] result = new int[len];
        int cur = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                result[cur++] = nums[i];
            }
        }

        return result;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,1,1,0]\n
// @lcpr case=end

// @lcpr case=start
// [0,1]\n
// @lcpr case=end

 */

