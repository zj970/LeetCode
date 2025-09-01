package editor.cn;
//给你一个仅由数字组成的字符串 s，在最多交换一次 相邻 且具有相同 奇偶性 的数字后，返回可以得到的字典序最小的字符串。 
//
// 如果两个数字都是奇数或都是偶数，则它们具有相同的奇偶性。例如，5 和 9、2 和 4 奇偶性相同，而 6 和 9 奇偶性不同。 
//
// 
//
// 示例 1： 
//
// 
// 输入： s = "45320" 
// 
//
// 输出： "43520" 
//
// 解释： 
//
// s[1] == '5' 和 s[2] == '3' 都具有相同的奇偶性，交换它们可以得到字典序最小的字符串。 
//
// 示例 2： 
//
// 
// 输入： s = "001" 
// 
//
// 输出： "001" 
//
// 解释： 
//
// 无需进行交换，因为 s 已经是字典序最小的。 
//
// 
//
// 提示： 
//
// 
// 2 <= s.length <= 100 
// s 仅由数字组成。 
// 
//
// Related Topics 贪心 字符串 👍 30 👎 0


/**
 * @author zj970
 * @since 2025-09-01 23:23:55
 */
public class P3216LexicographicallySmallestStringAfterASwap {
    public static void main(String[] args) {
        Solution solution = new P3216LexicographicallySmallestStringAfterASwap().new Solution();
        solution.getSmallestString("001");
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String getSmallestString(String s) {
            StringBuffer buffer = new StringBuffer();
            char[] arrays = s.toCharArray();
            int len = arrays.length - 1;
            for (int i = 0; i <= len; i++) {
                // 仅交换一次
                if (i <= (len - 1) &&
                        arrays[i] % 2 == arrays[i + 1] % 2
                        && arrays[i] > arrays[i + 1]) {
                    buffer.append(arrays[i + 1]);
                    buffer.append(arrays[i]);
                    buffer.append(s.substring(i + 2, len + 1));
                    break;
                }

                buffer.append(arrays[i]);
            }

            return buffer.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}