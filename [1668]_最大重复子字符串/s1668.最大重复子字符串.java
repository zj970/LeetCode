/*
 * @lc app=leetcode.cn id=1668 lang=java
 * @lcpr version=30112
 *
 * [1668] 最大重复子字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    //序列DP
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length(), m = word.length(), ans = 0;
        int[] f = new int[n + 10];
        for (int i = 0; i <= n ; i++) {
            if (i - m < 0) {
                continue;
            }
            if (sequence.substring(i-m, i).equals(word)) {
                f[i] = f[i-m] + 1;
            }
            ans = Math.max(ans, f[i]);
        }

        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// "ababc"\n"ab"\n
// @lcpr case=end

// @lcpr case=start
// "ababc"\n"ba"\n
// @lcpr case=end

// @lcpr case=start
// "ababc"\n"ac"\n
// @lcpr case=end

 */

