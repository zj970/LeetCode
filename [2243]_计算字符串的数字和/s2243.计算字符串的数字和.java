/*
 * @lc app=leetcode.cn id=2243 lang=java
 * @lcpr version=30204
 *
 * [2243] 计算字符串的数字和
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > k) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < sb.length(); i += k) {
                int sum = 0;
                for (int j = i; j < Math.min(i + k, sb.length()); j++) {
                    sum += sb.charAt(j) - '0';
                }
                temp.append(sum);
            }
            sb = temp;
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "11111222223"\n3\n
// @lcpr case=end

// @lcpr case=start
// "00000000"\n3\n
// @lcpr case=end

 */

