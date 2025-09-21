package editor.cn;
//给你一个由 n 个整数组成的数组 nums 和一个整数 k，请你确定是否存在 两个 相邻 且长度为 k 的 严格递增 子数组。具体来说，需要检查是否存在从下
//标 a 和 b (a < b) 开始的 两个 子数组，并满足下述全部条件： 
//
// 
// 这两个子数组 nums[a..a + k - 1] 和 nums[b..b + k - 1] 都是 严格递增 的。 
// 这两个子数组必须是 相邻的，即 b = a + k。 
// 
//
// 如果可以找到这样的 两个 子数组，请返回 true；否则返回 false。 
//
// 子数组 是数组中的一个连续 非空 的元素序列。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [2,5,7,8,9,2,3,4,3,1], k = 3 
// 
//
// 输出：true 
//
// 解释： 
//
// 
// 从下标 2 开始的子数组为 [7, 8, 9]，它是严格递增的。 
// 从下标 5 开始的子数组为 [2, 3, 4]，它也是严格递增的。 
// 两个子数组是相邻的，因此结果为 true。 
// 
//
// 示例 2： 
//
// 
// 输入：nums = [1,2,3,4,4,4,4,5,6,7], k = 5 
// 
//
// 输出：false 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 100 
// 1 <= 2 * k <= nums.length 
// -1000 <= nums[i] <= 1000 
// 
//
// Related Topics 数组 👍 4 👎 0


import java.util.List;

/**
 * @author zj970
 * @since 2025-09-21 23:46:58
 */
public class P3349AdjacentIncreasingSubarraysDetectionI {
    public static void main(String[] args) {
        Solution solution = new P3349AdjacentIncreasingSubarraysDetectionI().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
            int n = nums.size();
            for (int i = 0; i <= n - 2*k; i++) {
                boolean cre1 = true;
                for (int j = 1; j < k; j++) {
                    if (nums.get(i+j) <= nums.get(i+j-1)) {
                        cre1 = false;
                        break;
                    }
                }

                if (cre1) {
                    for (int j = k+1; j < 2*k; j++) {
                        if (nums.get(i+j) <= nums.get(i+j-1)) {
                            cre1 = false;
                            break;
                        }
                    }

                    if (cre1) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}