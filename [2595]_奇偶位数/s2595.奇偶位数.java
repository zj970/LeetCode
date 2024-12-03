/*
 * @lc app=leetcode.cn id=2595 lang=java
 * @lcpr version=30204
 *
 * [2595] 奇偶位数
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] evenOddBit(int n) {
        int[] result = new int[] { 0, 0 };
        int i = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                result[i%2]++;
            }
             n = n >> 1;
            i++;
        }
        return result;
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // 17\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // 2\n
 * // @lcpr case=end
 * 
 */
