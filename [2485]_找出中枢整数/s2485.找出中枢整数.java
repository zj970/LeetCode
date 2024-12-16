/*
 * @lc app=leetcode.cn id=2485 lang=java
 * @lcpr version=30204
 *
 * [2485] 找出中枢整数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int pivotInteger(int n) {
        int m = n * (n + 1) / 2;
        int x = (int) Math.sqrt(m);
        return x * x == m ? x : -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 8\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

 */

