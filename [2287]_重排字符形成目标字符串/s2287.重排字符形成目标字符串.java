/*
 * @lc app=leetcode.cn id=2287 lang=java
 * @lcpr version=30204
 *
 * [2287] 重排字符形成目标字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        int[] cntt = new int[26];
        for (int i = 0; i < target.length(); i++) {
            cntt[target.charAt(i) - 'a']++;
        }
        int res = s.length();
        for (int i = 0; i < 26; i++) {
            if (cntt[i] > 0) {
                res = Math.min(res, cnt[i] / cntt[i]);
            }
        }
        return res;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "ilovecodingonleetcode"\n"code"\n
// @lcpr case=end

// @lcpr case=start
// "abcba"\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// "abbaccaddaeea"\n"aaaaa"\n
// @lcpr case=end

 */

