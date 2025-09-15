package editor.cn;
//给你一个整数数组 nums 。 
//
// 请你将 nums 中每一个元素都替换为它的各个数位之 和 。 
//
// 请你返回替换所有元素以后 nums 中的 最小 元素。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [10,12,13,14] 
// 
//
// 输出：1 
//
// 解释： 
//
// nums 替换后变为 [1, 3, 4, 5] ，最小元素为 1 。 
//
// 示例 2： 
//
// 
// 输入：nums = [1,2,3,4] 
// 
//
// 输出：1 
//
// 解释： 
//
// nums 替换后变为 [1, 2, 3, 4] ，最小元素为 1 。 
//
// 示例 3： 
//
// 
// 输入：nums = [999,19,199] 
// 
//
// 输出：10 
//
// 解释： 
//
// nums 替换后变为 [27, 10, 19] ，最小元素为 10 。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 1 <= nums[i] <= 10⁴ 
// 
//
// Related Topics 数组 数学 👍 3 👎 0


import com.sun.tools.javac.Main;

/**
 * @author zj970
 * @since 2025-09-15 23:06:32
 */
public class P3300MinimumElementAfterReplacementWithDigitSum {
    public static void main(String[] args) {
        Solution solution = new P3300MinimumElementAfterReplacementWithDigitSum().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minElement(int[] nums) {
            int res = 37;
            for (int num : nums) {
                int tmp = 0;
                while (num >= 10) {
                    tmp += num % 10;
                    num /= 10;
                }

                tmp += num;
                res = Math.min(res, tmp);
            }

            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}