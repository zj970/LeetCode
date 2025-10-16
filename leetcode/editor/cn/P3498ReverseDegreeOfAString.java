package editor.cn;
//给你一个字符串 s，计算其 反转度。 
//
// 反转度的计算方法如下： 
//
// 
// 对于每个字符，将其在 反转 字母表中的位置（'a' = 26, 'b' = 25, ..., 'z' = 1）与其在字符串中的位置（下标从1 开始）相乘。
// 
// 将这些乘积加起来，得到字符串中所有字符的和。 
// 
//
// 返回 反转度。 
//
// 
//
// 示例 1： 
//
// 
// 输入： s = "abc" 
// 
//
// 输出： 148 
//
// 解释： 
//
// 
// 
// 
// 字母 
// 反转字母表中的位置 
// 字符串中的位置 
// 乘积 
// 
// 
// 'a' 
// 26 
// 1 
// 26 
// 
// 
// 'b' 
// 25 
// 2 
// 50 
// 
// 
// 'c' 
// 24 
// 3 
// 72 
// 
// 
// 
//
// 反转度是 26 + 50 + 72 = 148 。 
//
// 示例 2： 
//
// 
// 输入： s = "zaza" 
// 
//
// 输出： 160 
//
// 解释： 
//
// 
// 
// 
// 字母 
// 反转字母表中的位置 
// 字符串中的位置 
// 乘积 
// 
// 
// 'z' 
// 1 
// 1 
// 1 
// 
// 
// 'a' 
// 26 
// 2 
// 52 
// 
// 
// 'z' 
// 1 
// 3 
// 3 
// 
// 
// 'a' 
// 26 
// 4 
// 104 
// 
// 
// 
//
// 反转度是 1 + 52 + 3 + 104 = 160 。 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅包含小写字母。 
// 
//
// Related Topics 字符串 模拟 👍 2 👎 0


/**
 * @author zj970
 * @since 2025-10-16 23:55:57
 */
public class P3498ReverseDegreeOfAString {
    public static void main(String[] args) {
        Solution solution = new P3498ReverseDegreeOfAString().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverseDegree(String s) {
            int ans = 0;
            for (int i = 0; i < s.length(); i++) {
                ans += ('{' - s.charAt(i)) * (i + 1);
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}