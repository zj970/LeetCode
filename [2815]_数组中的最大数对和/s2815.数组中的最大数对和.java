/*
 * @lc app=leetcode.cn id=2815 lang=java
 * @lcpr version=30204
 *
 * [2815] 数组中的最大数对和
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxSum(int[] nums) {
        int ans = -1;
        int[] maxVal = new int[10];
        Arrays.fill(maxVal, Integer.MIN_VALUE); // 表示不存在最大值
        for (int v : nums) {
            int maxD = 0;
            for (int x = v; x > 0; x /= 10) {
                maxD = Math.max(maxD, x % 10);
            }
            ans = Math.max(ans, v + maxVal[maxD]);
            maxVal[maxD] = Math.max(maxVal[maxD], v);
        }
        return ans;
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [51,71,17,24,42]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,2,3,4]\n
 * // @lcpr case=end
 * 
 */
