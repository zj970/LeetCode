/*
 * @lc app=leetcode.cn id=1413 lang=java
 * @lcpr version=30111
 *
 * [1413] 逐步求和得到正数的最小值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minStartValue(int[] nums) {
        int accSum = 0, accSumMin = 0;
        for (int num : nums) {
            accSum += num;
            accSumMin = Math.min(accSumMin, accSum);
        }
        return -accSumMin + 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [-3,2,-3,4,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,-2,-3]\n
// @lcpr case=end

 */

