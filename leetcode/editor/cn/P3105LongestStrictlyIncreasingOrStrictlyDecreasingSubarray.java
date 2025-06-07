package editor.cn;
//给你一个整数数组 nums 。 
//
// 返回数组 nums 中 严格递增 或 严格递减 的最长非空子数组的长度。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [1,4,3,3,2] 
// 
//
// 输出：2 
//
// 解释： 
//
// nums 中严格递增的子数组有[1]、[2]、[3]、[3]、[4] 以及 [1,4] 。 
//
// nums 中严格递减的子数组有[1]、[2]、[3]、[3]、[4]、[3,2] 以及 [4,3] 。 
//
// 因此，返回 2 。 
//
// 示例 2： 
//
// 
// 输入：nums = [3,3,3,3] 
// 
//
// 输出：1 
//
// 解释： 
//
// nums 中严格递增的子数组有 [3]、[3]、[3] 以及 [3] 。 
//
// nums 中严格递减的子数组有 [3]、[3]、[3] 以及 [3] 。 
//
// 因此，返回 1 。 
//
// 示例 3： 
//
// 
// 输入：nums = [3,2,1] 
// 
//
// 输出：3 
//
// 解释： 
//
// nums 中严格递增的子数组有 [3]、[2] 以及 [1] 。 
//
// nums 中严格递减的子数组有 [3]、[2]、[1]、[3,2]、[2,1] 以及 [3,2,1] 。 
//
// 因此，返回 3 。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50 
// 1 <= nums[i] <= 50 
// 
//
// Related Topics 数组 👍 7 👎 0


/**
 * @author zj970
 * @since 2025-06-06 23:39:19
 */
public class P3105LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
    public static void main(String[] args) {
        Solution solution = new P3105LongestStrictlyIncreasingOrStrictlyDecreasingSubarray().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int longestMonotonicSubarray(int[] nums) {
            boolean upMode = true; // 当前序列是否为递增
            int res = 1; // 全局最长序列
            int cur = 1; // 当前递增/递减序列长度
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] == nums[i - 1]) {
                    // 情况a：非严格，序列保持1不变
                    cur = 1;
                } else if (nums[i] > nums[i - 1] == upMode) {
                    // 情况b：当前递增情况与当前序列模式一样++
                    cur++;
                } else {
                    // 情况c：当前递增情况与当前序列模式不一样，重头开始
                    cur = 2;
                    upMode = !upMode;
                }

                res = Math.max(cur, res);
            }

            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}