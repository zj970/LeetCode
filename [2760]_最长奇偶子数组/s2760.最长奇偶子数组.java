/*
 * @lc app=leetcode.cn id=2760 lang=java
 * @lcpr version=30204
 *
 * [2760] 最长奇偶子数组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0, n = nums.length;
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                if (isSatisfied(nums, l, r, threshold)) {
                    res = Math.max(res, r - l + 1);
                }
            }
        }

        return res;
    }

    public boolean isSatisfied(int[] nums, int l, int r, int threshold) {
        if (nums[l] % 2 != 0) {
            return false;
        }

        for (int i = l; i <= r; i++) {
            if (nums[i] > threshold || (i < r && nums[i] % 2 == nums[i + 1] % 2)) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,5,4]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// [2,3,4,5]\n4\n
// @lcpr case=end

 */

