/*
 * @lc app=leetcode.cn id=1941 lang=java
 * @lcpr version=30203
 *
 * [1941] 检查是否所有字符出现次数相同
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }
        int t = cnt[s.charAt(0) - 'a'];
        for (int i = 1; i < 26; i++) {
            if (cnt[i] != 0 && cnt[i] != t) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abacbc"\n
// @lcpr case=end

// @lcpr case=start
// "aaabb"\n
// @lcpr case=end

 */

