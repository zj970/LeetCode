/*
 * @lc app=leetcode.cn id=1374 lang=java
 * @lcpr version=30110
 *
 * [1374] 生成每种字符都是奇数个的字符串
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 1) {
            return sb.append("a".repeat(n)).toString();
        }
        return sb.append("a".repeat(n - 1)).append("b").toString();
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 2\n
// @lcpr case=end

// @lcpr case=start
// 7\n
// @lcpr case=end

 */

