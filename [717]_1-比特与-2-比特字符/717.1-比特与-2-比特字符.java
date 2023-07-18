/*
 * @lc app=leetcode.cn id=717 lang=java
 *
 * [717] 1 比特与 2 比特字符
 */

// @lc code=start
// bits 的编码方式是唯一确定的，因此若遍历到 i=n−1，那么说明最后一个字符一定是第一种字符
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
        }
        return i == n - 1;
    }
}
// @lc code=end

