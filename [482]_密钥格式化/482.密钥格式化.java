/*
 * @lc app=leetcode.cn id=482 lang=java
 * @lcpr version=21907
 *
 * [482] 密钥格式化
 */

/**
 * 给定一个许可密钥字符串 s，仅由字母、数字字符和破折号组成。字符串由 n 个破折号分成 n + 1 组。
 * 你也会得到一个整数 k 。

我们想要重新格式化字符串 s，使每一组包含 k 个字符，除了第一组，它可以比 k 短，但仍然必须包含至少一个字符。此外，两组之间必须插入破折号，并且应该将所有小写字母转换为大写字母。

返回 重新格式化的许可密钥 。
 */
// @lc code=start
class Solution {
    public String licenseKeyFormatting(String s, int k) {

        /**
         * 首先我们取出所有不为破折号的字符，
         * 题目要求对取出的字符进行重新分组，
         * 使得每个分组恰好包含 kk 个字符，
         * 且必须满足第一个分组包含的字符个数必须小于等于 kk，
         * 但至少要包含 11 个字符。
         * 设已经取出的字符的总数为 nn，
         * 只需满足第一个分组包含的字符数目刚好等于 n \bmod k，
         * 剩余的分组包含的字符数目刚好等于 kk。
         */
        StringBuilder ans = new StringBuilder();
        int cnt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                cnt++;
                ans.append(Character.toUpperCase(s.charAt(i)));
                if (cnt % k == 0) {
                    ans.append("-");
                }
            }
        }
        if (ans.length() > 0 && ans.charAt(ans.length() - 1) == '-') {
            ans.deleteCharAt(ans.length() - 1);
        }
        
        return ans.reverse().toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// "5F3Z-2e-9-w"\n4\n
// @lcpr case=end

// @lcpr case=start
// "2-5g-3-J"\n2\n
// @lcpr case=end

 */

