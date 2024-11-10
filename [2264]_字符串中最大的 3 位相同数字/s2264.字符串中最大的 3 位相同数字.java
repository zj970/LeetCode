/*
 * @lc app=leetcode.cn id=2264 lang=java
 * @lcpr version=30204
 *
 * [2264] 字符串中最大的 3 位相同数字
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                sb.append(num.charAt(i));
                sb.append(num.charAt(i + 1));
                sb.append(num.charAt(i + 2));
            }
        }
        if (sb.length() == 0) {
            return "";
        } else if (sb.length() == 3) {
            return sb.toString();
        } else {
            int max = 0;
            int index = 0;
            for (int i = 0; i < sb.length() - 2; i += 3) {
                if (sb.charAt(i) > max) {
                    max = sb.charAt(i);
                    index = i;
                }
            }
            return sb.substring(index, index + 3);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "6777133339"\n
// @lcpr case=end

// @lcpr case=start
// "2300019"\n
// @lcpr case=end

// @lcpr case=start
// "42352338"\n
// @lcpr case=end

 */

