/*
 * @lc app=leetcode.cn id=2496 lang=java
 * @lcpr version=30204
 *
 * [2496] 数组中字符串的最大值
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int maximumValue(String[] strs) {
        int maxValue = 0;
        for (String string : strs) {
            boolean isNumber = true;
            
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i) < '0' || string.charAt(i) > '9') {
                    isNumber = false;
                    break;
                }
            }

            if (isNumber) {
                maxValue = maxValue > Integer.valueOf(string) ? maxValue:Integer.valueOf(string);
            } else {
                maxValue = maxValue > string.length() ? maxValue:string.length();
            }
        }

        return maxValue;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["alic3","bob","3","4","00000"]\n
// @lcpr case=end

// @lcpr case=start
// ["1","01","001","0001"]\n
// @lcpr case=end

 */

