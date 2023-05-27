/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

/**
 * 我们定义，在以下情况时，单词的大写用法是正确的：

全部字母都是大写，比如 "USA" 。
单词中所有字母都不是大写，比如 "leetcode" 。
如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
 */
// @lc code=start
class Solution {

    /**
     * 首先判断字符串是否全部由大写字母组成，如果是直接返回true；
     * 接着判断字符串是否全部由小写字母组成，如果是也直接返回true；
     * 最后判断字符串首字母是否为大写字母，且其余字符均为小写字母，如果是则返回true，否则返回false
     */
    public boolean detectCapitalUse(String word) {
        if (word.toUpperCase().equals(word)) { // 全部字母都是大写
            return true;
        }
        if (word.toLowerCase().equals(word)) { // 全部字母都不是大写
            return true;
        }
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).toLowerCase().equals(word.substring(1))) { // 首字母是大写且后面的字母都不是大写
            return true;
        }
        return false;
    }

}
// @lc code=end

