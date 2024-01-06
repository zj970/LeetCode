/*
 * @lc app=leetcode.cn id=1716 lang=java
 * @lcpr version=30113
 *
 * [1716] 计算力扣银行的钱
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int totalMoney(int n) {
        int a = n /7, b = n % 7;
        return ((49 + a * 7) * a + (a * 2 + b + 1)*b) >> 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

// @lcpr case=start
// 20\n
// @lcpr case=end

 */

