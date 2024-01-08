/*
 * @lc app=leetcode.cn id=1704 lang=java
 * @lcpr version=30113
 *
 * [1704] 判断字符串的两半是否相似
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);
        String h = "aeiouAEIOU";
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < a.length(); i++) {
            if (h.indexOf(a.charAt(i)) >= 0) {
                sum1++;
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (h.indexOf(b.charAt(i)) >= 0) {
                sum2++;
            }
        }
        return sum1 == sum2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "book"\n
// @lcpr case=end

// @lcpr case=start
// "textbook"\n
// @lcpr case=end

 */

