package editor.cn;
//给你一个 非负 整数数组 nums 和一个整数 k 。 
//
// 如果一个数组中所有元素的按位或运算 OR 的值 至少 为 k ，那么我们称这个数组是 特别的 。 
//
// 请你返回 nums 中 最短特别非空 子数组的长度，如果特别子数组不存在，那么返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [1,2,3], k = 2 
// 
//
// 输出：1 
//
// 解释： 
//
// 子数组 [3] 的按位 OR 值为 3 ，所以我们返回 1 。 
//
// 注意，[2] 也是一个特别子数组。 
//
// 示例 2： 
//
// 
// 输入：nums = [2,1,8], k = 10 
// 
//
// 输出：3 
//
// 解释： 
//
// 子数组 [2,1,8] 的按位 OR 值为 11 ，所以我们返回 3 。 
//
// 示例 3： 
//
// 
// 输入：nums = [1,2], k = 0 
// 
//
// 输出：1 
//
// 解释： 
//
// 子数组 [1] 的按位 OR 值为 1 ，所以我们返回 1 。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50 
// 0 <= nums[i] <= 50 
// 0 <= k < 64 
// 
//
// Related Topics 位运算 数组 滑动窗口 👍 38 👎 0


/**
 * @author zj970
 * @since 2025-06-05 23:40:20
 */
public class P3095ShortestSubarrayWithOrAtLeastKI {
    public static void main(String[] args) {
        Solution solution = new P3095ShortestSubarrayWithOrAtLeastKI().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumSubarrayLength(int[] nums, int k) {
            int n = nums.length;
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int value = 0;
                for (int j = i; j < n; j++) {
                    value |= nums[j];
                    if (value >= k) {
                        res = Math.min(res, j - i + 1);
                        break;
                    }
                }
            }
            return res == Integer.MAX_VALUE ? -1 : res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}