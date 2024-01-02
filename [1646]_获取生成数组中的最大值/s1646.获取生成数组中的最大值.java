/*
 * @lc app=leetcode.cn id=1646 lang=java
 * @lcpr version=30112
 *
 * [1646] 获取生成数组中的最大值
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int getMaximumGenerated(int n) {
        int[] nums = new int[n + 1];
        int max = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                nums[0] = 0;
            } else if (i == 1) {
                nums[1] = 1;
            }
            if ((2 * i) >= 2 && (2 * i) <= n) {
                nums[2 * i] = nums[i];
            }
            if ((2 * i + 1) >= 2 && (2 * i + 1) <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
            }

        }
        for (int i = 0; i <= n; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // 7\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // 2\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // 3\n
 * // @lcpr case=end
 * 
 */
