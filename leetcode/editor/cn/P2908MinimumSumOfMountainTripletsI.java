package editor.cn;
//给你一个下标从 0 开始的整数数组 nums 。 
//
// 如果下标三元组 (i, j, k) 满足下述全部条件，则认为它是一个 山形三元组 ： 
//
// 
// i < j < k 
// nums[i] < nums[j] 且 nums[k] < nums[j] 
// 
//
// 请你找出 nums 中 元素和最小 的山形三元组，并返回其 元素和 。如果不存在满足条件的三元组，返回 -1 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [8,6,1,5,3]
//输出：9
//解释：三元组 (2, 3, 4) 是一个元素和等于 9 的山形三元组，因为： 
//- 2 < 3 < 4
//- nums[2] < nums[3] 且 nums[4] < nums[3]
//这个三元组的元素和等于 nums[2] + nums[3] + nums[4] = 9 。可以证明不存在元素和小于 9 的山形三元组。
// 
//
// 示例 2： 
//
// 
//输入：nums = [5,4,8,7,10,2]
//输出：13
//解释：三元组 (1, 3, 5) 是一个元素和等于 13 的山形三元组，因为： 
//- 1 < 3 < 5 
//- nums[1] < nums[3] 且 nums[5] < nums[3]
//这个三元组的元素和等于 nums[1] + nums[3] + nums[5] = 13 。可以证明不存在元素和小于 13 的山形三元组。
// 
//
// 示例 3： 
//
// 
//输入：nums = [6,5,4,3,4,5]
//输出：-1
//解释：可以证明 nums 中不存在山形三元组。
// 
//
// 
//
// 提示： 
//
// 
// 3 <= nums.length <= 50 
// 1 <= nums[i] <= 50 
// 
//
// Related Topics 数组 👍 53 👎 0


/**
 * @author zj970
 * @since 2025-05-14 23:05:52
 */
public class P2908MinimumSumOfMountainTripletsI {
    public static void main(String[] args) {
        Solution solution = new P2908MinimumSumOfMountainTripletsI().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumSum(int[] nums) {
            // 我的想法
/*            int result = -1;
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[i] < nums[j] && nums[k] < nums[j]) {
                            int sum = nums[i] + nums[j] + nums[k];
                            result = result == -1 ? sum : Math.min(result, sum);
                        }
                    }
                }
            }

            return result;*/

            // 枚举中间的数
            // 求出 j 左边所有元素的最小值和右边所有元素的最小值
            // suf[i] = min(suf[i+1], nums[i])
            int n = nums.length;
            int[] suf = new int[n];
            suf[n - 1] = nums[n - 1];

            for (int i = n - 2; i > 1; i--) {
                suf[i] = Math.min(suf[i +1], nums[i]);
            }

            int ans = Integer.MAX_VALUE;
            int pre = nums[0]; // 前缀最小值
            for (int j = 1; j < n - 1; j++) {
                if (pre < nums[j] && nums[j] > suf[j + 1]) { // 山形
                    ans = Math.min(ans, pre + nums[j] + suf[j + 1]); // 更新答案
                }

                pre = Math.min(pre, nums[j]);
            }

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)


}