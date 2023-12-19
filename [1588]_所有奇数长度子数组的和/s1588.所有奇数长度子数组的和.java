/*
 * @lc app=leetcode.cn id=1588 lang=java
 * @lcpr version=30112
 *
 * [1588] 所有奇数长度子数组的和
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans = 0;

        int n = arr.length;
        // 1,4,2,5,3
        // 0,1,2,3,4
        for (int i = 0; i < n; i++) {
            // 左边奇数个数的可能性
            int leftOddCount = (i + 1) / 2;
            // 右边奇数个数的可能性
            int rightOddCount = (n - i) / 2;
            // 左边偶数个数的可能性
            int leftEvenCount = i / 2 + 1;
            // 右边偶数个数的可能性
            int rightEvenCount = (n - i - 1) / 2 + 1;
            // 计算结果
            ans += arr[i] * (leftOddCount * rightOddCount + leftEvenCount * rightEvenCount);
        }
        return ans;
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // [1,4,2,5,3]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [1,2]\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // [10,11,12]\n
 * // @lcpr case=end
 * 
 */
