package editor.cn;
//给你一个字符串 s 。 
//
// 你的任务是重复以下操作删除 所有 数字字符： 
//
// 
// 删除 第一个数字字符 以及它左边 最近 的 非数字 字符。 
// 
//
// 请你返回删除所有数字字符以后剩下的字符串。 
//
// 注意，该操作不能对左侧没有任何非数字字符的数字执行。 
//
// 示例 1： 
//
// 
// 输入：s = "abc" 
// 
//
// 输出："abc" 
//
// 解释： 
//
// 字符串中没有数字。
// 
//
// 示例 2： 
//
// 
// 输入：s = "cb34" 
// 
//
// 输出："" 
//
// 解释： 
//
// 一开始，我们对 s[2] 执行操作，s 变为 "c4" 。 
//
// 然后对 s[1] 执行操作，s 变为 "" 。 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 100 
// s 只包含小写英文字母和数字字符。 
// 输入保证所有数字都可以按以上操作被删除。 
// 
//
// Related Topics 栈 字符串 模拟 👍 35 👎 0


import java.util.Stack;

/**
 * @author zj970
 * @since 2025-08-26 23:54:42
 */
public class P3174ClearDigits {
    public static void main(String[] args) {
        Solution solution = new P3174ClearDigits().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String clearDigits(String s) {
            StringBuilder sb = new StringBuilder();
            for(char c:s.toCharArray()){
                if (Character.isDigit(c)){
                    sb.deleteCharAt(sb.length()-1);
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}