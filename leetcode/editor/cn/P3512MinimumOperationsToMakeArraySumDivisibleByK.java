package editor.cn;
//给你一个整数数组 nums 和一个整数 k。你可以执行以下操作任意次： 
//
// 
// 选择一个下标 i，并将 nums[i] 替换为 nums[i] - 1。 
// 
//
// 返回使数组元素之和能被 k 整除所需的最小操作次数。 
//
// 
//
// 示例 1： 
//
// 
// 输入： nums = [3,9,7], k = 5 
// 
//
// 输出： 4 
//
// 解释： 
//
// 
// 对 nums[1] = 9 执行 4 次操作。现在 nums = [3, 5, 7]。 
// 数组之和为 15，可以被 5 整除。 
// 
//
// 示例 2： 
//
// 
// 输入： nums = [4,1,3], k = 4 
// 
//
// 输出： 0 
//
// 解释： 
//
// 
// 数组之和为 8，已经可以被 4 整除。因此不需要操作。 
// 
//
// 示例 3： 
//
// 
// 输入： nums = [3,2], k = 6 
// 
//
// 输出： 5 
//
// 解释： 
//
// 
// 对 nums[0] = 3 执行 3 次操作，对 nums[1] = 2 执行 2 次操作。现在 nums = [0, 0]。 
// 数组之和为 0，可以被 6 整除。 
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 1000 
// 1 <= nums[i] <= 1000 
// 1 <= k <= 100 
// 
//
// Related Topics 数组 数学 👍 2 👎 0


import java.util.Arrays;

/**
 * @author zj970
 * @since 2025-10-24 23:41:56
 */
public class P3512MinimumOperationsToMakeArraySumDivisibleByK {
    public static void main(String[] args) {
        Solution solution = new P3512MinimumOperationsToMakeArraySumDivisibleByK().new Solution();
        System.out.print(solution.minOperations(new int[]{3, 9, 7}, 5));
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minOperations(int[] nums, int k) {
            return Arrays.stream(nums).sum() % k;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}