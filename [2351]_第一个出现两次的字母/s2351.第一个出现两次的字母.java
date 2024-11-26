/*
 * @lc app=leetcode.cn id=2351 lang=java
 * @lcpr version=30204
 *
 * [2351] 第一个出现两次的字母
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public char repeatedCharacter(String s) {
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            if (counts[s.charAt(i) - 'a'] == 2) {
                return s.charAt(i);
            }
        }
        return ' ';

    }
}
// @lc code=end



/*
// @lcpr case=start
// "abccbaacz"\n
// @lcpr case=end

// @lcpr case=start
// "abcdd"\n
// @lcpr case=end

 */

