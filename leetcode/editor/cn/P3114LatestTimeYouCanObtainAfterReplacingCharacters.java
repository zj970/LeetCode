package editor.cn;
//给你一个字符串 s，表示一个 12 小时制的时间格式，其中一些数字（可能没有）被 "?" 替换。 
//
// 12 小时制时间格式为 "HH:MM" ，其中 HH 的取值范围为 00 至 11，MM 的取值范围为 00 至 59。最早的时间为 00:00，最晚的时
//间为 11:59。 
//
// 你需要将 s 中的 所有 "?" 字符替换为数字，使得结果字符串代表的时间是一个 有效 的 12 小时制时间，并且是可能的 最晚 时间。 
//
// 返回结果字符串。 
//
// 
//
// 示例 1： 
//
// 
// 输入： s = "1?:?4" 
// 
//
// 输出： "11:54" 
//
// 解释： 通过替换 "?" 字符，可以得到的最晚12小时制时间是 "11:54"。 
//
// 示例 2： 
//
// 
// 输入： s = "0?:5?" 
// 
//
// 输出： "09:59" 
//
// 解释： 通过替换 "?" 字符，可以得到的最晚12小时制时间是 "09:59"。 
//
// 
//
// 提示： 
//
// 
// s.length == 5 
// s[2] 是字符 ":" 
// 除 s[2] 外，其他字符都是数字或 "?" 
// 输入保证在替换 "?" 字符后至少存在一个介于 "00:00" 和 "11:59" 之间的时间。 
// 
//
// Related Topics 字符串 枚举 👍 3 👎 0


/**
 * @author zj970
 * @since 2025-06-09 23:19:05
 */
public class P3114LatestTimeYouCanObtainAfterReplacingCharacters {
    public static void main(String[] args) {
        Solution solution = new P3114LatestTimeYouCanObtainAfterReplacingCharacters().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String findLatestTime(String s) {
            // 0,1,2,3,4
            // 1,1/9, 5, 9;
            StringBuilder sb = new StringBuilder();
            if (s.charAt(0) == '?') {
                if (s.charAt(1) != '?' && s.charAt(1) >= '2') {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }else {
                sb.append(s.charAt(0));
            }

            if (s.charAt(1) == '?') {
                if (sb.charAt(0) == '1') {
                    sb.append('1');
                } else {
                    sb.append('9');
                }
            } else {
                sb.append(s.charAt(1));
            }
            sb.append(s.charAt(2));

            if (s.charAt(3) == '?') {
                sb.append('5');
            } else {
                sb.append(s.charAt(3));
            }

            if (s.charAt(4) == '?') {
                sb.append('9');
            } else {
                sb.append(s.charAt(4));
            }

            return sb.toString();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}