package editor.cn;
//给你一个数字数组 digits，你需要从中选择三个数字组成一个三位偶数，你的任务是求出 不同 三位偶数的数量。 
//
// 注意：每个数字在三位偶数中都只能使用 一次 ，并且 不能 有前导零。 
//
// 
//
// 示例 1： 
//
// 
// 输入： digits = [1,2,3,4] 
// 
//
// 输出： 12 
//
// 解释： 可以形成的 12 个不同的三位偶数是 124，132，134，142，214，234，312，314，324，342，412 和 432。注意，不
//能形成 222，因为数字 2 只有一个。 
//
// 示例 2： 
//
// 
// 输入： digits = [0,2,2] 
// 
//
// 输出： 2 
//
// 解释： 可以形成的三位偶数是 202 和 220。注意，数字 2 可以使用两次，因为数组中有两个 2 。 
//
// 示例 3： 
//
// 
// 输入： digits = [6,6,6] 
// 
//
// 输出： 1 
//
// 解释： 只能形成 666。 
//
// 示例 4： 
//
// 
// 输入： digits = [1,3,5] 
// 
//
// 输出： 0 
//
// 解释： 无法形成三位偶数。 
//
// 
//
// 提示： 
//
// 
// 3 <= digits.length <= 10 
// 0 <= digits[i] <= 9 
// 
//
// Related Topics 递归 数组 哈希表 枚举 👍 4 👎 0


import java.util.HashSet;
import java.util.Set;

/**
 * @author zj970
 * @since 2025-10-18 17:50:15
 */
public class P3483Unique3DigitEvenNumbers {
    public static void main(String[] args) {
        Solution solution = new P3483Unique3DigitEvenNumbers().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int totalNumbers(int[] digits) {
            Set<Integer> set = new HashSet<>();
            int n = digits.length;
            for (int i = 0; i < n; i++) {
                // 个位数
                int a = digits[i];
                if (a % 2 > 0) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    // 十位数
                    if (j == i) {
                        continue;
                    }
                    for (int k = 0; k < n; k++) {
                        // 百位数
                        int c = digits[k];
                        if (c == 0 || k == i || k == j) {
                            continue;
                        }
                        set.add(c * 100 + digits[j] * 10 + a);
                    }
                }
            }
            return set.size();
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}