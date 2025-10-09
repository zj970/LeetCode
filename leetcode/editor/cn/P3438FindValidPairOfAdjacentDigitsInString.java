package editor.cn;
//给你一个只包含数字的字符串 s 。如果 s 中两个 相邻 的数字满足以下条件，我们称它们是 合法的 ： 
//
// 
// 前面的数字 不等于 第二个数字。 
// 两个数字在 s 中出现的次数 恰好 分别等于这个数字本身。 
// 
//
// 请你从左到右遍历字符串 s ，并返回最先找到的 合法 相邻数字。如果这样的相邻数字不存在，请你返回一个空字符串。 
//
// 
//
// 示例 1： 
//
// 
// 输入：s = "2523533" 
// 
//
// 输出："23" 
//
// 解释： 
//
// 数字 '2' 出现 2 次，数字 '3' 出现 3 次。"23" 中每个数字在 s 中出现的次数都恰好分别等于数字本身。所以输出 "23" 。 
//
// 示例 2： 
//
// 
// 输入：s = "221" 
// 
//
// 输出："21" 
//
// 解释： 
//
// 数字 '2' 出现 2 次，数字 '1' 出现 1 次。所以输出 "21" 。 
//
// 示例 3： 
//
// 
// 输入：s = "22" 
// 
//
// 输出："" 
//
// 解释： 
//
// 没有合法的相邻数字。 
//
// 
//
// 提示： 
//
// 
// 2 <= s.length <= 100 
// s 只包含 '1' 到 '9' 的数字。 
// 
//
// Related Topics 哈希表 字符串 计数 👍 5 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zj970
 * @since 2025-10-09 23:27:57
 */
public class P3438FindValidPairOfAdjacentDigitsInString {
    public static void main(String[] args) {
        Solution solution = new P3438FindValidPairOfAdjacentDigitsInString().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String findValidPair(String s) {
            Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
            int length = s.length();
            for (int i = 0; i < length; i++) {
                int digit = s.charAt(i) - '0';
                counts.put(digit, counts.getOrDefault(digit, 0) + 1);
            }
            for (int i = 0; i < length - 1; i++) {
                int digit0 = s.charAt(i) - '0', digit1 = s.charAt(i + 1) - '0';
                if (digit0 != digit1 && counts.get(digit0) == digit0 && counts.get(digit1) == digit1) {
                    return s.substring(i, i + 2);
                }
            }
            return "";
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}