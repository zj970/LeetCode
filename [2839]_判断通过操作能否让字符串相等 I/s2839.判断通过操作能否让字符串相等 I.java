/*
 * @lc app=leetcode.cn id=2839 lang=java
 * @lcpr version=30204
 *
 * [2839] 判断通过操作能否让字符串相等 I
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean canBeEqual(String s1, String s2) {
        var cnt1 = new int[2][26];
        var cnt2 = new int[2][26];
        for (int i = 0; i < s1.length(); i++) {
            cnt1[i % 2][s1.charAt(i) - 'a']++;
            cnt2[i % 2][s2.charAt(i) - 'a']++;
        }
        return Arrays.deepEquals(cnt1, cnt2);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcd"\n"cdab"\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n"dacb"\n
// @lcpr case=end

 */

