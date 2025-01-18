/*
 * @lc app=leetcode.cn id=2717 lang=java
 * @lcpr version=30204
 *
 * [2717] 半有序排列
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int n = nums.length;
        int first = 0, last = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                first = i;
            }
            if (nums[i] == n) {
                last = i;
            }
        }
        return first + n - 1 - last - (last < first ? 1 : 0);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,4,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,4,2,5]\n
// @lcpr case=end

 */

