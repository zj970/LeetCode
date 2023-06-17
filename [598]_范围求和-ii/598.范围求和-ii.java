/*
 * @lc app=leetcode.cn id=598 lang=java
 *
 * [598] 范围求和 II
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
            // 如果操作数组为空，则矩阵中所有的元素都是 0，最大整数的个数就是矩阵中的元素个数
            if (ops == null || ops.length == 0) {
                return m * n;
            }
            
            // 执行所有操作
            int minA = m, minB = n;
            for (int[] op : ops) {
                minA = Math.min(minA, op[0]);
                minB = Math.min(minB, op[1]);
            }
            
            // 最大整数就是左上角的元素，它出现的次数是剩余的行数和列数的乘积
            return minA * minB;
        }
}
// @lc code=end

