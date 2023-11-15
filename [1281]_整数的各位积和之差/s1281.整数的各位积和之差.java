/*
 * @lc app=leetcode.cn id=1281 lang=java
 * @lcpr version=30109
 *
 * [1281] 整数的各位积和之差
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int m = 1, s = 0;
        while (n != 0) {
            int x = n % 10;
            n /= 10;
            m *= x;
            s += x;
        }
        return m - s;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 234\n
// @lcpr case=end

// @lcpr case=start
// 4421\n
// @lcpr case=end

 */

