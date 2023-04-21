/*
 * @lc app=leetcode.cn id=367 lang=java
 * @lcpr version=21906
 *
 * [367] 有效的完全平方数
 */

 /**
  * 给你一个正整数 num 。如果 num 是一个完全平方数，则返回 true ，否则返回 false 。

完全平方数 是一个可以写成某个整数的平方的整数。换句话说，它可以写成某个整数和自身的乘积。

不能使用任何内置的库函数，如  sqrt 。
  */
// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        double x0 = num;

        while(true)
        {
            double x1 = (x0 + num/x0) / 2;
            if(x0 - x1 < 1e-6)
            {
                break;
            }

            x0 = x1;
        }

        int x = (int) x0;

        return x*x == num;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 16\n
// @lcpr case=end

// @lcpr case=start
// 14\n
// @lcpr case=end

 */

