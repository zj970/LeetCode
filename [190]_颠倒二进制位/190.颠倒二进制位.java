/*
 * @lc app=leetcode.cn id=190 lang=java
 * @lcpr version=21901
 *
 * [190] 颠倒二进制位
 */

// @lc code=start
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 00000010100101000001111010011100\n
// @lcpr case=end

// @lcpr case=start
// 11111111111111111111111111111101\n
// @lcpr case=end

 */


