package editor.cn;
//给你一个正整数 n。 
//
// 返回 大于等于 n 且二进制表示仅包含 置位 位的 最小 整数 x 。 
//
// 置位 位指的是二进制表示中值为 1 的位。 
//
// 
//
// 示例 1： 
//
// 
// 输入： n = 5 
// 
//
// 输出： 7 
//
// 解释： 
//
// 7 的二进制表示是 "111"。 
//
// 示例 2： 
//
// 
// 输入： n = 10 
// 
//
// 输出： 15 
//
// 解释： 
//
// 15 的二进制表示是 "1111"。 
//
// 示例 3： 
//
// 
// 输入： n = 3 
// 
//
// 输出： 3 
//
// 解释： 
//
// 3 的二进制表示是 "11"。 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 1000 
// 
//
// Related Topics 位运算 数学 👍 7 👎 0


/**
 * @author zj970
 * @since 2025-09-24 00:33:22
 */
public class P3370SmallestNumberWithAllSetBits {
    public static void main(String[] args) {
        Solution solution = new P3370SmallestNumberWithAllSetBits().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int smallestNumber(int n) {
            return (Integer.highestOneBit(n) << 1) - 1;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}