/*
 * @lc app=leetcode.cn id=1544 lang=java
 * @lcpr version=30111
 *
 * [1544] 整理字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String makeGood(String s) {
        StringBuffer ret = new StringBuffer();
        int retIndex = -1;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (ret.length() > 0 && Character.toLowerCase(ret.charAt(retIndex)) == Character.toLowerCase(ch) && ret.charAt(retIndex) != ch) {
                ret.deleteCharAt(retIndex);
                retIndex--;
            } else {
                ret.append(ch);
                retIndex++;
            }
        }
        return ret.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leEeetcode"\n
// @lcpr case=end

// @lcpr case=start
// "abBAcC"\n
// @lcpr case=end

// @lcpr case=start
// "s"\n
// @lcpr case=end

 */

