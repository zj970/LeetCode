/*
 * @lc app=leetcode.cn id=1863 lang=java
 * @lcpr version=30116
 *
 * [1863] 找出所有子集的异或总和再求和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int subsetXORSum(int[] nums) {
        int res = 0;
        for(int num : nums)
        {
            res |= num;
        }
        return res << (nums.length - 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3]\n
// @lcpr case=end

// @lcpr case=start
// [5,1,6]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,5,6,7,8]\n
// @lcpr case=end

 */

