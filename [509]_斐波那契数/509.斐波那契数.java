/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if(n == 0)
        {
            return 0;
        }else if(n == 1)
        {
            return 1;
        }else{
            //递归
            //return fib(n-1)+fib(n-2);

            //动态规划 使用动态规划的方法，将每次计算结果保存下来，减少重复计算
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }
}
// @lc code=end

