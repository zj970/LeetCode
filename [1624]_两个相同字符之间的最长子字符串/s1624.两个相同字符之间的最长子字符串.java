/*
 * @lc app=leetcode.cn id=1624 lang=java
 * @lcpr version=30112
 *
 * [1624] 两个相同字符之间的最长子字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] idxs = new int[26];
        Arrays.fill(idxs, 310);
        int n = s.length(), ans = -1;
        for (int i = 0; i < n; i++) {
            int u = s.charAt(i) - 'a';
            idxs[u] = Math.min(idxs[u], i);
            ans = Math.max(ans, i - idxs[u] - 1);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "aa"\n
// @lcpr case=end

// @lcpr case=start
// "abca"\n
// @lcpr case=end

// @lcpr case=start
// "cbzxy"\n
// @lcpr case=end

// @lcpr case=start
// "cabbac"\n
// @lcpr case=end

 */

