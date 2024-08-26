/*
 * @lc app=leetcode.cn id=1984 lang=java
 * @lcpr version=30204
 *
 * [1984] 学生分数的最小差值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < n; ++i) {
            ans = Math.min(ans, nums[i + k - 1] - nums[i]);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [90]\n1\n
// @lcpr case=end

// @lcpr case=start
// [9,4,1,7]\n2\n
// @lcpr case=end

 */

