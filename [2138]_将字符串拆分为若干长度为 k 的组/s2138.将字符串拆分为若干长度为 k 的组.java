/*
 * @lc app=leetcode.cn id=2138 lang=java
 * @lcpr version=30204
 *
 * [2138] 将字符串拆分为若干长度为 k 的组
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int m = (n + k - 1) / k;
        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i * k; j < Math.min((i + 1) * k, n); j++) {
                sb.append(s.charAt(j));
            }
            while (sb.length() < k) {
                sb.append(fill);
            }
            ans[i] = sb.toString();
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcdefghi"\n3\n"x"\n
// @lcpr case=end

// @lcpr case=start
// "abcdefghij"\n3\n"x"\n
// @lcpr case=end

 */

