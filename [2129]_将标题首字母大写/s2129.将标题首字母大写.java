/*
 * @lc app=leetcode.cn id=2129 lang=java
 * @lcpr version=30204
 *
 * [2129] 将标题首字母大写
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String capitalizeTitle(String title) {
        String[] s = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() <= 2) {
                sb.append(s[i].toLowerCase());
            } else {
                sb.append(Character.toUpperCase(s[i].charAt(0)));
                sb.append(s[i].substring(1).toLowerCase());
            }
            if (i!= s.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "capiTalIze tHe titLe"\n
// @lcpr case=end

// @lcpr case=start
// "First leTTeR of EACH Word"\n
// @lcpr case=end

// @lcpr case=start
// "i lOve leetcode"\n
// @lcpr case=end

 */

