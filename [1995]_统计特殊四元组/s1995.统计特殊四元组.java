/*
 * @lc app=leetcode.cn id=1995 lang=java
 * @lcpr version=30204
 *
 * [1995] 统计特殊四元组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countQuadruplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int a = 0; a < n; ++a) {
            for (int b = a + 1; b < n; ++b) {
                for (int c = b + 1; c < n; ++c) {
                    for (int d = c + 1; d < n; ++d) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            ++ans;
                        }
                    }
                }
            }
        }
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,6]\n
// @lcpr case=end

// @lcpr case=start
// [3,3,6,4,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,3,5]\n
// @lcpr case=end

 */

