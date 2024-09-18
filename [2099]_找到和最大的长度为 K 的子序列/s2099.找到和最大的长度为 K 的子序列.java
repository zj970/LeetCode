/*
 * @lc app=leetcode.cn id=2099 lang=java
 * @lcpr version=30204
 *
 * [2099] 找到和最大的长度为 K 的子序列
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[][] numsIndices = new int[n][2];
        for (int i = 0; i < n; i++) {
            numsIndices[i][0] = nums[i];
            numsIndices[i][1] = i;
        }
        Arrays.sort(numsIndices, (a, b) -> b[0] - a[0]);
        Arrays.sort(numsIndices, 0, k, (a, b) -> a[1] - b[1]);
        int[] subsequence = new int[k];
        for (int i = 0; i < k; i++) {
            subsequence[i] = numsIndices[i][0];
        }
        return subsequence;
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,3,3]\n2\n
// @lcpr case=end

// @lcpr case=start
// [-1,-2,3,4]\n3\n
// @lcpr case=end

// @lcpr case=start
// [3,4,3,3]\n2\n
// @lcpr case=end

 */

