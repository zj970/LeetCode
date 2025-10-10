package editor.cn;
//给你一个由小写英文字母组成的字符串 s。 
//
// 请你找出字符串中两个字符 a1 和 a2 的出现频次之间的 最大 差值 diff = freq(a1) - freq(a2)，这两个字符需要满足： 
//
// 
// a1 在字符串中出现 奇数次 。 
// a2 在字符串中出现 偶数次 。 
// 
//
// 返回 最大 差值。 
//
// 
//
// 示例 1： 
//
// 
// 输入：s = "aaaaabbc" 
// 
//
// 输出：3 
//
// 解释： 
//
// 
// 字符 'a' 出现 奇数次 ，次数为 5 ；字符 'b' 出现 偶数次 ，次数为 2 。 
// 最大差值为 5 - 2 = 3 。 
// 
//
// 示例 2： 
//
// 
// 输入：s = "abcabcab" 
// 
//
// 输出：1 
//
// 解释： 
//
// 
// 字符 'a' 出现 奇数次 ，次数为 3 ；字符 'c' 出现 偶数次 ，次数为 2 。 
// 最大差值为 3 - 2 = 1 。 
// 
//
// 
//
// 提示： 
//
// 
// 3 <= s.length <= 100 
// s 仅由小写英文字母组成。 
// s 至少由一个出现奇数次的字符和一个出现偶数次的字符组成。 
// 
//
// Related Topics 哈希表 字符串 计数 👍 12 👎 0


import java.util.Arrays;

/**
 * @author zj970
 * @since 2025-10-10 22:49:56
 */
public class P3442MaximumDifferenceBetweenEvenAndOddFrequencyI {
    public static void main(String[] args) {
        Solution solution = new P3442MaximumDifferenceBetweenEvenAndOddFrequencyI().new Solution();
        solution.maxDifference("aaaaabbc");
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxDifference(String s) {
            int[] maps = new int[26];
            int len = s.length();
            int a = Integer.MAX_VALUE;
            int b = Integer.MIN_VALUE;
            for (int i = 0; i < len; i++) {
                maps[s.charAt(i) - 'a']++;
            }

            for (int i = 0; i < maps.length; i++) {
                if (maps[i] == 0) {
                    continue;
                }

                if (maps[i] % 2 == 0) {
                    a = Math.min(a, maps[i]);
                } else {
                    b = Math.max(b, maps[i]);
                }
            }

            return b - a;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}