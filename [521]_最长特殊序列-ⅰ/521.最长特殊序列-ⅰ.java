/*
 * @lc app=leetcode.cn id=521 lang=java
 *
 * [521] 最长特殊序列 Ⅰ
 */

// @lc code=start
class Solution {
    /***
     * 如果两个字符串相同，则它们没有独特的子序列，返回 -1。

否则，返回长度更长的字符串的长度，例如 a 长度大于 b 长度，则返回 a 的长度。

因为独特子序列是指某个字符串所独有的最长子序列，所以当 a 不是 b 的子序列时，
a 就是它自己的独特子序列，返回 a 的长度即可
     * @param a
     * @param b
     * @return
     */
    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
// @lc code=end

