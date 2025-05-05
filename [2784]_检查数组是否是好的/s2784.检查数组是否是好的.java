/*
 * @lc app=leetcode.cn id=2784 lang=java
 * @lcpr version=30204
 *
 * [2784] 检查数组是否是好的
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        int[] cnt = new int[n + 1];
        for (int num : nums) {
            if (num > n || num == n && cnt[num] > 1 || num < n && cnt[num] > 0) {
                return false;
            }
            ++cnt[num];
        }

        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2, 1, 3]\n
// @lcpr case=end

// @lcpr case=start
// [1, 3, 3, 2]\n
// @lcpr case=end

// @lcpr case=start
// [1, 1]\n
// @lcpr case=end

// @lcpr case=start
// [3, 4, 4, 1, 2, 1]\n
// @lcpr case=end

 */

