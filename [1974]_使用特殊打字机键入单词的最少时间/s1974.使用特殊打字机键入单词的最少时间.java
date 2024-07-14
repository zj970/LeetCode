/*
 * @lc app=leetcode.cn id=1974 lang=java
 * @lcpr version=30204
 *
 * [1974] 使用特殊打字机键入单词的最少时间
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minTimeToType(String word) {
        int length = word.length();
        int minTime = length;
        char prev = 'a';
        for (int i = 0; i < length; i++) {
            char curr = word.charAt(i);
            int diff = Math.abs(curr - prev);
            minTime += Math.min(diff, 26 - diff);
            prev = curr;
        }
        return minTime;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n
// @lcpr case=end

// @lcpr case=start
// "bza"\n
// @lcpr case=end

// @lcpr case=start
// "zjpc"\n
// @lcpr case=end

 */

