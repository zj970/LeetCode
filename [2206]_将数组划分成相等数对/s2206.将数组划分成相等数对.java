/*
 * @lc app=leetcode.cn id=2206 lang=java
 * @lcpr version=30204
 *
 * [2206] 将数组划分成相等数对
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i+=2) {
            if (nums[i] != nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,2,3,2,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// @lcpr case=end

 */

