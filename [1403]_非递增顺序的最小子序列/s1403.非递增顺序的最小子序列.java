/*
 * @lc app=leetcode.cn id=1403 lang=java
 * @lcpr version=30111
 *
 * [1403] 非递增顺序的最小子序列
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0, cur = 0, idx = nums.length - 1;
        for (int i : nums) sum += i;
        List<Integer> ans = new ArrayList<>();
        while (cur <= sum) {
            sum -= nums[idx];
            cur += nums[idx];
            ans.add(nums[idx--]);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,3,10,9,8]\n
// @lcpr case=end

// @lcpr case=start
// [4,4,7,6,7]\n
// @lcpr case=end

// @lcpr case=start
// [6]\n
// @lcpr case=end

 */

