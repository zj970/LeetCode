/*
 * @lc app=leetcode.cn id=2239 lang=java
 * @lcpr version=30204
 *
 * [2239] 找到最接近 0 的数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findClosestNumber(int[] nums) {
        int res = nums[0];
        int dis = Math.abs(nums[0]);
        for (int num : nums) {
            if (Math.abs(num) < dis) {
                dis = Math.abs(num);
                res = num;
            } else if (Math.abs(num) == dis) {
                res = Math.max(res, num);
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-4,-2,1,4,8]\n
// @lcpr case=end

// @lcpr case=start
// [2,-1,1]\n
// @lcpr case=end

 */

