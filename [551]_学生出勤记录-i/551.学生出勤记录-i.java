/*
 * @lc app=leetcode.cn id=551 lang=java
 *
 * [551] 学生出勤记录 I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        if (s == null || s.equals("")) {
            return false;
        }
        int absent = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A')
            {
                absent++;
                if(absent >=2)
                {
                    return false;
                }
            }

            if (i+2 < s.length() && s.charAt(i) == 'L' && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L')
            {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

