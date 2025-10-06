package editor.cn;
//给你一个 循环 数组 nums ，请你找出相邻元素之间的 最大 绝对差值。 
//
// 注意：一个循环数组中，第一个元素和最后一个元素是相邻的。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [1,2,4] 
// 
//
// 输出：3 
//
// 解释： 
//
// 由于 nums 是循环的，nums[0] 和 nums[2] 是相邻的，它们之间的绝对差值是最大值 |4 - 1| = 3 。 
//
// 示例 2： 
//
// 
// 输入：nums = [-5,-10,-5] 
// 
//
// 输出：5 
//
// 解释： 
//
// 相邻元素 nums[0] 和 nums[1] 之间的绝对差值为最大值 |-5 - (-10)| = 5 。 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 100 
// -100 <= nums[i] <= 100 
// 
//
// Related Topics 数组 👍 15 👎 0


/**
 * @author zj970
 * @since 2025-10-06 18:09:30
 */
public class P3423MaximumDifferenceBetweenAdjacentElementsInACircularArray {
    public static void main(String[] args) {
        Solution solution = new P3423MaximumDifferenceBetweenAdjacentElementsInACircularArray().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxAdjacentDistance(int[] nums) {
            int ans = 0;
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                if (i == length - 1) {
                    ans = Math.max(Math.abs(nums[i] - nums[0]), ans);
                } else {
                    ans = Math.max(Math.abs(nums[i] - nums[i + 1]), ans);
                }
            }

            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}