package editor.cn;
//给你一个整数 n。 
//
// 返回 n² 的 十六进制表示 和 n³ 的 三十六进制表示 拼接成的字符串。 
//
// 十六进制 数定义为使用数字 0 – 9 和大写字母 A - F 表示 0 到 15 的值。 
//
// 三十六进制 数定义为使用数字 0 – 9 和大写字母 A - Z 表示 0 到 35 的值。 
//
// 
//
// 示例 1： 
//
// 
// 输入：n = 13 
// 
//
// 输出： "A91P1" 
//
// 解释： 
//
// 
// n² = 13 * 13 = 169。在十六进制中，它转换为 (10 * 16) + 9 = 169，对应于 "A9"。 
// n³ = 13 * 13 * 13 = 2197。在三十六进制中，它转换为 (1 * 36²) + (25 * 36) + 1 = 2197，对应于 "1
//P1"。 
// 连接两个结果得到 "A9" + "1P1" = "A91P1"。 
// 
//
// 示例 2： 
//
// 
// 输入：n = 36 
// 
//
// 输出："5101000" 
//
// 解释： 
//
// 
// n² = 36 * 36 = 1296。在十六进制中，它转换为 (5 * 16²) + (1 * 16) + 0 = 1296，对应于 "510"。 
// n³ = 36 * 36 * 36 = 46656。在三十六进制中，它转换为 (1 * 36³) + (0 * 36²) + (0 * 36) + 0 =
// 46656，对应于 "1000"。 
// 连接两个结果得到 "510" + "1000" = "5101000"。 
// 
//
// 
//
// 提示: 
//
// 
// 1 <= n <= 1000 
// 
//
// Related Topics 数学 字符串 👍 1 👎 0


/**
 * @author zj970
 * @since 2025-11-03 23:51:27
 */
public class P3602HexadecimalAndHexatrigesimalConversion {
    public static void main(String[] args) {
        Solution solution = new P3602HexadecimalAndHexatrigesimalConversion().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String concatHex36(int n) {
            // 计算 n² 和 n³，使用 long 防止溢出
            long square = (long) n * n;
            long cube = (long) n * n * n;

            // 使用 Java API 进行进制转换
            String hex = Long.toHexString(square).toUpperCase();  // 十六进制
            String base36 = Long.toString(cube, 36).toUpperCase(); // 三十六进制

            return hex + base36;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}