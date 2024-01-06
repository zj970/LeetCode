/*
 * @lc app=leetcode.cn id=1694 lang=java
 * @lcpr version=30113
 *
 * [1694] 重新格式化电话号码
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String reformatNumber(String number) {
        StringBuilder digits = new StringBuilder();
        for (int i = 0; i < number.length(); ++i) {
            char ch = number.charAt(i);
            if (Character.isDigit(ch)) {
                digits.append(ch);
            }
        }

        int n = digits.length();
        int pt = 0;
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            if (n > 4) {
                ans.append(digits.substring(pt, pt + 3) + "-");
                pt += 3;
                n -= 3;
            } else {
                if (n == 4) {
                    ans.append(digits.substring(pt, pt + 2) + "-" + digits.substring(pt + 2, pt + 4));
                } else {
                    ans.append(digits.substring(pt, pt + n));
                }
                break;
            }
        }
        return ans.toString();
    }
}
// @lc code=end

/*
 * // @lcpr case=start
 * // "1-23-45 6"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "123 4-567"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "123 4-5678"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "12"\n
 * // @lcpr case=end
 * 
 * // @lcpr case=start
 * // "--17-5 229 35-39475 "\n
 * // @lcpr case=end
 * 
 */
