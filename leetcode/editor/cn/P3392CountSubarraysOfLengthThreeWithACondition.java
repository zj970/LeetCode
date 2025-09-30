package editor.cn;
//给你一个整数数组 nums ，请你返回长度为 3 的 子数组 的数量，满足第一个数和第三个数的和恰好为第二个数的一半。 
//
// 子数组 指的是一个数组中连续 非空 的元素序列。 
//
// 
//
// 示例 1： 
//
// 
// 输入：nums = [1,2,1,4,1] 
// 
//
// 输出：1 
//
// 解释： 
//
// 只有子数组 [1,4,1] 包含 3 个元素且第一个和第三个数字之和是中间数字的一半。number. 
//
// 示例 2： 
//
// 
// 输入：nums = [1,1,1] 
// 
//
// 输出：0 
//
// 解释： 
//
// [1,1,1] 是唯一长度为 3 的子数组，但第一个数和第三个数的和不是第二个数的一半。 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 100 
// -100 <= nums[i] <= 100 
// 
//
// Related Topics 数组 👍 29 👎 0


/**
 * @author zj970
 * @since 2025-09-30 20:35:22
 */
public class P3392CountSubarraysOfLengthThreeWithACondition {
    public static void main(String[] args) {
        Solution solution = new P3392CountSubarraysOfLengthThreeWithACondition().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int countSubarrays(int[] nums) {
            int n = nums.length;
            int ans = 0;
            for (int i = 1; i < n - 1; ++i) {
                if (nums[i] == (nums[i - 1] + nums[i + 1]) * 2) {
                    ++ans;
                }
            }

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}