/*
 * @lc app=leetcode.cn id=2006 lang=java
 * @lcpr version=30204
 *
 * [2006] 差的绝对值为 K 的数对数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,2,1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [1,3]\n3\n
// @lcpr case=end

// @lcpr case=start
// [3,2,1,5,4]\n2\n
// @lcpr case=end

 */

