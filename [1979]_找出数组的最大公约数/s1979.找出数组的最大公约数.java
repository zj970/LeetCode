/*
 * @lc app=leetcode.cn id=1979 lang=java
 * @lcpr version=30204
 *
 * [1979] 找出数组的最大公约数
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums[nums.length - 1]; i > 0; i--) {
            if (nums[0] % i == 0 &&
                    nums[nums.length - 1] % i == 0) {
                return i;
            }
        }

        return 1;

    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [2,5,6,9,10]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [7,5,6,8,3]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [3,3]\n
 * // @lcpr case=end
 * 
 */
