/*
 * @lc app=leetcode.cn id=2047 lang=java
 * @lcpr version=30204
 *
 * [2047] 句子中的有效单词数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countValidWords(String sentence) {
        int n = sentence.length();
        int l = 0, r = 0;
        int ret = 0;
        while (true) {
            while (l < n && sentence.charAt(l) == ' ') {
                l++;
            }
            if (l >= n) {
                break;
            }
            r = l + 1;
            while (r < n && sentence.charAt(r) != ' ') {
                r++;
            }
            if (isValid(sentence.substring(l, r))) { // 判断根据空格分解出来的 token 是否有效
                ret++;
            }
            l = r + 1;
        }
        return ret;
    }

    public boolean isValid(String word) {
        int n = word.length();
        boolean hasHyphens = false;
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(word.charAt(i))) {
                return false;
            } else if (word.charAt(i) == '-') {
                if (hasHyphens == true || i == 0 || i == n - 1 || !Character.isLetter(word.charAt(i - 1)) || !Character.isLetter(word.charAt(i + 1))) {
                    return false;
                }
                hasHyphens = true;
            } else if (word.charAt(i) == '!' || word.charAt(i) == '.' || word.charAt(i) == ',') {
                if (i != n - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "cat and  dog"\n
// @lcpr case=end

// @lcpr case=start
// "!this  1-s b8d!"\n
// @lcpr case=end

// @lcpr case=start
// "alice and  bob are playing stone-game10"\n
// @lcpr case=end

 */

