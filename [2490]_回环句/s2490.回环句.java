/*
 * @lc app=leetcode.cn id=2490 lang=java
 * @lcpr version=30204
 *
 * [2490] 回环句
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isCircularSentence(String sentence) {
        var s = sentence.toCharArray();
        int n = s.length;
        if (s[0] != s[n - 1])
            return false;
        for (int i = 1; i < n - 1; i++)
            if (s[i] == ' ' && s[i - 1] != s[i + 1])
                return false;
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leetcode exercises sound delightful"\n
// @lcpr case=end

// @lcpr case=start
// "eetcode"\n
// @lcpr case=end

// @lcpr case=start
// "Leetcode is cool"\n
// @lcpr case=end

 */

