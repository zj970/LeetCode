/*
 * @lc app=leetcode.cn id=2114 lang=java
 * @lcpr version=30204
 *
 * [2114] 句子中的最多单词数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (String sentence : sentences) {
            int count = 0;
            for (char c : sentence.toCharArray()) {
                if (c == ' ') {
                    count++;
                }
            }
            ans = Math.max(ans, count + 1);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]\n
// @lcpr case=end

// @lcpr case=start
// ["please wait", "continue to fight", "continue to win"]\n
// @lcpr case=end

 */

