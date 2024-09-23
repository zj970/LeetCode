/*
 * @lc app=leetcode.cn id=2108 lang=java
 * @lcpr version=30204
 *
 * [2108] 找出数组中的第一个回文字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String firstPalindrome(String[] words) {
        for(String str : words) {
            int  i = 0;
            for (; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                    break;
                }
                if ( i == str.length() - 1) {
                     return str;
                }
            }
        }
        return "";
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abc","car","ada","racecar","cool"]\n
// @lcpr case=end

// @lcpr case=start
// ["notapalindrome","racecar"]\n
// @lcpr case=end

// @lcpr case=start
// ["def","ghi"]\n
// @lcpr case=end

 */

