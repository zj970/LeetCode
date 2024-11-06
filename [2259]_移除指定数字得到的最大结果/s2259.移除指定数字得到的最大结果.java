/*
 * @lc app=leetcode.cn id=2259 lang=java
 * @lcpr version=30204
 *
 * [2259] 移除指定数字得到的最大结果
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String removeDigit(String number, char digit) {
        int index = 0, n = number.length();
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == digit) {
                index = i;
                if (i < n - 1 && digit < number.charAt(i + 1))
                    break;
            }
        }
        number = number.substring(0, index) + number.substring(index + 1);
        return number;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "123"\n"3"\n
// @lcpr case=end

// @lcpr case=start
// "1231"\n"1"\n
// @lcpr case=end

// @lcpr case=start
// "551"\n"5"\n
// @lcpr case=end

 */

