/*
 * @lc app=leetcode.cn id=2427 lang=java
 * @lcpr version=30204
 *
 * [2427] 公因子的数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int commonFactors(int a, int b) {
        int max = a > b ? a : b;
        int counts = 0;
        for (int i = 1; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                counts++;
            }
        }
        return counts;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 12\n6\n
// @lcpr case=end

// @lcpr case=start
// 25\n30\n
// @lcpr case=end

 */

