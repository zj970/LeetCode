/*
 * @lc app=leetcode.cn id=1512 lang=java
 * @lcpr version=30111
 *
 * [1512] 好数对的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] == nums[j]) {
                    ++res;
                }
            }
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,1,1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

 */

