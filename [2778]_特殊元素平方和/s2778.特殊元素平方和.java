/*
 * @lc app=leetcode.cn id=2778 lang=java
 * @lcpr version=30204
 *
 * [2778] 特殊元素平方和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0, len = nums.length;
        for (int i = 1; i <= len; i++) {
            if (len % i == 0) {
                ans += nums[i-1] * nums[i-1];
            }
        }

        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [2,7,1,19,18,3]\n
// @lcpr case=end

 */

