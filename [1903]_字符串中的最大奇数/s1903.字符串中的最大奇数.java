/*
 * @lc app=leetcode.cn id=1903 lang=java
 * @lcpr version=30203
 *
 * [1903] 字符串中的最大奇数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String largestOddNumber(String num) {
        StringBuilder builder = new StringBuilder();
        int last = -1;
        for(int i = 0; i < num.length(); i++){
            int temp = num.charAt(i) - '0';
            if (temp % 2 != 0) {
                last = i;
            }
        }

        for(int i = 0; i <= last; i++){
            builder.append(num.charAt(i));
        }

        return builder.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "52"\n
// @lcpr case=end

// @lcpr case=start
// "4206"\n
// @lcpr case=end

// @lcpr case=start
// "35427"\n
// @lcpr case=end

 */

