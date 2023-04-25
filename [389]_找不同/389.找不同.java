/*
 * @lc app=leetcode.cn id=389 lang=java
 * @lcpr version=21907
 *
 * [389] 找不同
 */

// @lc code=start
/**
 * Tags
Companies
给定两个字符串 s 和 t ，它们只包含小写字母。

字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。

请找出在 t 中被添加的字母。


提示：

0 <= s.length <= 1000
t.length == s.length + 1
s 和 t 只包含小写字母
 */
class Solution {
    /**
     * 位运算 如果将两个字符串拼接成一个字符串
     * 则问题可以转换成字符串出现奇数次的字符
     * 类似 136.只出现一次的数字
     * 我们可以使用位运算的技巧来解决问题
     * 
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int ret = 0;

        for (int i = 0; i < s.length(); i++) {
            ret^=s.charAt(i);
        }


        for (int i = 0; i < t.length(); i++) {
            ret^=t.charAt(i);
        }

        return (char)ret;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcd"\n"abcde"\n
// @lcpr case=end

// @lcpr case=start
// ""\n"y"\n
// @lcpr case=end

 */

