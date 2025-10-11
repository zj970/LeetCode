package editor.cn;
//给定一个整数数组 nums 和一个整数 k，如果元素 nums[i] 严格 大于下标 i - k 和 i + k 处的元素（如果这些元素存在），则该元素 
//nums[i] 被认为是 好 的。如果这两个下标至少一个不存在，那么 nums[i] 仍然被认为是 好 的。 
//
// 返回数组中所有 好 元素的 和。 
//
// 
//
// 示例 1： 
//
// 
// 输入： nums = [1,3,2,1,5,4], k = 2 
// 
//
// 输出： 12 
//
// 解释： 
//
// 好的数字包括 nums[1] = 3，nums[4] = 5 和 nums[5] = 4，因为它们严格大于下标 i - k 和 i + k 处的数字。 
//
// 示例 2： 
//
// 
// 输入： nums = [2,1], k = 1 
// 
//
// 输出： 2 
//
// 解释： 
//
// 唯一的好数字是 nums[0] = 2，因为它严格大于 nums[1]。 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 100 
// 1 <= nums[i] <= 1000 
// 1 <= k <= floor(nums.length / 2) 
// 
//
// Related Topics 数组 👍 2 👎 0


/**
 * @author zj970
 * @since 2025-10-11 23:48:12
 */
public class P3452SumOfGoodNumbers {
    public static void main(String[] args) {
        Solution solution = new P3452SumOfGoodNumbers().new Solution();
        solution.sumOfGoodNumbers(new int[]{1, 3, 2, 1, 5, 4}, 2);
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int sumOfGoodNumbers(int[] nums, int k) {
            int n = nums.length;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int x = nums[i];
                if ((i < k || x > nums[i - k]) && (i + k >= n || x > nums[i + k])) {
                    ans += x;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}