/*
 * @lc app=leetcode.cn id=1437 lang=java
 * @lcpr version=30111
 *
 * [1437] 是否所有 1 都至少相隔 k 个元素
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int prev = -1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 1) {
                if (prev != -1 && i - prev - 1 < k) {
                    return false;
                }
                prev = i;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,0,0,0,1,0,0,1]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,0,0,1,0,1]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1]\n0\n
// @lcpr case=end

// @lcpr case=start
// [0,1,0,1]\n1\n
// @lcpr case=end

 */

