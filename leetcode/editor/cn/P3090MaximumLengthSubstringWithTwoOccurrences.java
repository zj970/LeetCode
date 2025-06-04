package editor.cn;
//给你一个字符串 s ，请找出满足每个字符最多出现两次的最长子字符串，并返回该子字符串的 最大 长度。 
//
// 
//
// 示例 1： 
//
// 
// 输入： s = "bcbbbcba" 
// 
//
// 输出： 4 
//
// 解释： 
//
// 以下子字符串长度为 4，并且每个字符最多出现两次："bcbbbcba"。 
//
// 示例 2： 
//
// 
// 输入： s = "aaaa" 
// 
//
// 输出： 2 
//
// 解释： 
//
// 以下子字符串长度为 2，并且每个字符最多出现两次："aaaa"。 
//
// 
//
// 提示： 
//
// 
// 
// 2 <= s.length <= 100 
// 
// s 仅由小写英文字母组成。 
// 
//
// Related Topics 哈希表 字符串 滑动窗口 👍 28 👎 0


import java.util.HashMap;

/**
 * @author zj970
 * @since 2025-06-04 23:25:52
 */
public class P3090MaximumLengthSubstringWithTwoOccurrences {
    public static void main(String[] args) {
        Solution solution = new P3090MaximumLengthSubstringWithTwoOccurrences().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maximumLengthSubstring(String s) {
            char[] array = s.toCharArray();
            int ans = 0;
            int[] cnt = new int[26];
            for (int left = 0, right = 0; right < array.length; right++) {
                int b = array[right] - 'a';
                cnt[b]++;
                while (cnt[b] > 2) {
                    cnt[array[left] - 'a']--;
                    left++;
                }

                ans = Math.max(ans, right - left + 1);
            }

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}