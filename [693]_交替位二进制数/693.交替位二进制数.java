/*
 * @lc app=leetcode.cn id=693 lang=java
 *
 * [693] 交替位二进制数
 */

// @lc code=start
class Solution {
    /**
     * 对输入 nnn 的二进制表示右移一位后，得到的数字再与 nnn 按位异或得到 aaa。当且仅当输入 nnn 为交替位二进制数时，aaa 的二进制表示全为 111（不包括前导 000）。这里进行简单证明：当 aaa 的某一位为 111 时，当且仅当 nnn 的对应位和其前一位相异。当 aaa 的每一位为 111 时，当且仅当 nnn 的所有相邻位相异，即 nnn 为交替位二进制数。

将 aaa 与 a+1a + 1a+1 按位与，当且仅当 aaa 的二进制表示全为 111 时，结果为 000。这里进行简单证明：当且仅当 aaa 的二进制表示全为 111 时，a+1a + 1a+1 可以进位，并将原最高位置为 000，按位与的结果为 000。否则，不会产生进位，两个最高位都为 111，相与结果不为 000。
     */
    public boolean hasAlternatingBits(int n) {
        int a = n ^ (n>>1);
        return ( a & (a + 1))  == 0;
    }
}
// @lc code=end

