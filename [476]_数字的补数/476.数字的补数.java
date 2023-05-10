/*
 * @lc app=leetcode.cn id=476 lang=java
 * @lcpr version=21907
 *
 * [476] 数字的补数
 */
/**
 * 对整数的二进制表示取反（0 变 1 ，1 变 0）后，再转换为十进制表示，可以得到这个整数的补数。

例如，整数 5 的二进制表示是 "101" ，取反后得到 "010" ，再转回十进制表示得到补数 2 。
给你一个整数 num ，输出它的补数。
 */
// @lc code=start
class Solution {
    public int findComplement(int num) {
        // String binaryString = Integer.toBinaryString(num); // 将整数转换为二进制字符串
        // StringBuilder sb = new StringBuilder(); // 用于存放反转后的字符串
        // for (char c : binaryString.toCharArray()) {
        //     sb.append(c == '1' ? '0' : '1'); // 对于每个字符进行反转操作
        //     }
        // String complementBinaryString = sb.toString(); // 得到反转后的二进制字符串
        // return Integer.parseInt(complementBinaryString, 2); // 将二进制字符串转换为整数并返回

        /**
         * 使用位运算符对整数进行位运算来实现对二进制数位的操作
         * 我们可以新建一个掩码值 mask，长度与 num 二进制的长度相同
         * 每一位的值都为1，然后对 mask 进行异或操作，得到 num 的补数。
         */
        //int mask = (Integer.highestOneBit(num) << 1) - 1; // 构造掩码值
        //return num ^ mask; // 异或操作，得到补数

        /**
         * 利用位运算符和原位操作实现对二进制数位的操作。
         * 我们可以通过对 num 进行位运算和异或操作来得到 num 的补数，
         * 而不需要额外使用掩码或二进制字符串。
         */
        // int tmp = num;
        // int bit = 1;
        // while (tmp != 0) { // 将二进制数每一位取反
        //     num ^= bit;
        //     bit <<= 1;
        //     tmp >>= 1;
        // }
        // return num;

        int highestOneBit = Integer.highestOneBit(num);
        int mask = (highestOneBit << 1) - 1;
        return num ^ mask;

    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

