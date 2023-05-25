/*
 * @lc app=leetcode.cn id=507 lang=java
 *  对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。

给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。
 * [507] 完美数
 */

// @lc code=start
class Solution {

    public boolean checkPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }
        int divisors_sum = 1; // 1 一定是 n 的因子之一，从 1 开始计算
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors_sum += i;
                if (n / i != i) { // 避免重复计算
                    divisors_sum += n / i;
                }
            }
        }
        return divisors_sum == n;
    }
}
// @lc code=end

