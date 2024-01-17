/*
 * @lc app=leetcode.cn id=1752 lang=java
 * @lcpr version=30113
 *
 * [1752] 检查数组是否经排序和轮转得到
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean check(int[] nums) {
        int cnt = 0;
        for (int i = 0, n = nums.length; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                ++cnt;
            }
        }
        return cnt <= 1;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,4,5,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,1,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

 */

