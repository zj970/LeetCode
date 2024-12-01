/*
 * @lc app=leetcode.cn id=2379 lang=java
 * @lcpr version=30204
 *
 * [2379] 得到 K 个黑块的最少涂色次数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumRecolors(String blocks, int k) {
        var s = blocks.toCharArray();
        int cntW = 0;
        for (int i = 0; i < k; ++i)
            cntW += s[i] & 1;
        int ans = cntW;
        for (int i = k; i < s.length; ++i) {
            cntW += (s[i] & 1) - (s[i - k] & 1);
            ans = Math.min(ans, cntW);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "WBBWWBBWBW"\n7\n
// @lcpr case=end

// @lcpr case=start
// "WBWBBBW"\n2\n
// @lcpr case=end

 */

