/*
 * @lc app=leetcode.cn id=1929 lang=java
 * @lcpr version=30203
 *
 * [1929] 数组串联
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,2,1]\n
// @lcpr case=end

 */

