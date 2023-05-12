/*
 * @lc app=leetcode.cn id=485 lang=java
 * @lcpr version=21907
 *
 * [485] 最大连续 1 的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,0,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,0,1,1,0,1]\n
// @lcpr case=end

 */

