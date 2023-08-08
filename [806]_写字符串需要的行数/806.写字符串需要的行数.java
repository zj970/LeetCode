/*
 * @lc app=leetcode.cn id=806 lang=java
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width = 0;
        for(int i = 0; i < s.length();i++)
        {
            width += widths[s.charAt(i) - 'a'];
            if(width > 100)
            {
                lines++;
                width = widths[s.charAt(i) - 'a'];
            }
        }
        return new int[] {lines,width};
    }
}
// @lc code=end

