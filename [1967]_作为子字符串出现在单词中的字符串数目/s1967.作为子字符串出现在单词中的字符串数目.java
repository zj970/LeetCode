/*
 * @lc app=leetcode.cn id=1967 lang=java
 * @lcpr version=30204
 *
 * [1967] 作为子字符串出现在单词中的字符串数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern)) {
                ans++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["a","abc","bc","d"]\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// ["a","b","c"]\n"aaaaabbbbb"\n
// @lcpr case=end

// @lcpr case=start
// ["a","a","a"]\n"ab"\n
// @lcpr case=end

 */

