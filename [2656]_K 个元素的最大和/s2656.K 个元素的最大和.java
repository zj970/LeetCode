/*
 * @lc app=leetcode.cn id=2656 lang=java
 * @lcpr version=30204
 *
 * [2656] K 个元素的最大和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximizeSum(int[] nums, int k) {
        int res = 0, length = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < k; i++) {
            res += nums[length - 1];
            nums[length - 1] = ++nums[length - 1];
        }

        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5]\n3\n
// @lcpr case=end

// @lcpr case=start
// [5,5,5]\n2\n
// @lcpr case=end

 */

