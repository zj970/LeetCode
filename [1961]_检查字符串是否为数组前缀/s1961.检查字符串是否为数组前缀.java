/*
 * @lc app=leetcode.cn id=1961 lang=java
 * @lcpr version=30204
 *
 * [1961] 检查字符串是否为数组前缀
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int length = s.length();
        int index = 0;
        for (String word : words) {
            int wordLength = word.length();
            if (index + wordLength > length) {
                break;
            }
            for (int i = 0; i < wordLength; i++, index++) {
                if (word.charAt(i) != s.charAt(index)) {
                    return false;
                }
            }
            if (index == length) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "iloveleetcode"\n["i","love","leetcode","apples"]\n
// @lcpr case=end

// @lcpr case=start
// "iloveleetcode"\n["apples","i","love","leetcode"]\n
// @lcpr case=end

 */

