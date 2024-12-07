/*
 * @lc app=leetcode.cn id=2413 lang=java
 * @lcpr version=30204
 *
 * [2413] 最小偶倍数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n == 1) {
            return 2;
        }
        return (n % 2 == 0) ? n : n << 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n
// @lcpr case=end

// @lcpr case=start
// 6\n
// @lcpr case=end

 */

