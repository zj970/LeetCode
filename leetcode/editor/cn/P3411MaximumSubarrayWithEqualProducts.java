package editor.cn;
//给你一个由 正整数 组成的数组 nums。 
//
// 如果一个数组 arr 满足 prod(arr) == lcm(arr) * gcd(arr)，则称其为 乘积等价数组 ，其中： 
//
// 
// prod(arr) 表示 arr 中所有元素的乘积。 
// gcd(arr) 表示 arr 中所有元素的最大公因数 (GCD)。 
// lcm(arr) 表示 arr 中所有元素的最小公倍数 (LCM)。 
// 
//
// 返回数组 nums 的 最长 乘积等价 子数组 的长度。 
//
// 
//
// 示例 1： 
//
// 
// 输入： nums = [1,2,1,2,1,1,1] 
// 
//
// 输出： 5 
//
// 解释： 
//
// 最长的乘积等价子数组是 [1, 2, 1, 1, 1]，其中 prod([1, 2, 1, 1, 1]) = 2， gcd([1, 2, 1, 1, 1]
//) = 1，以及 lcm([1, 2, 1, 1, 1]) = 2。 
//
// 示例 2： 
//
// 
// 输入： nums = [2,3,4,5,6] 
// 
//
// 输出： 3 
//
// 解释： 
//
// 最长的乘积等价子数组是 [3, 4, 5]。 
//
// 示例 3： 
//
// 
// 输入： nums = [1,2,3,1,4,5,1] 
// 
//
// 输出： 5 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 100 
// 1 <= nums[i] <= 10 
// 
//
// Related Topics 数组 数学 枚举 数论 滑动窗口 👍 12 👎 0


/**
 * @author zj970
 * @since 2025-10-04 11:21:42
 */
public class P3411MaximumSubarrayWithEqualProducts {
    public static void main(String[] args) {
        Solution solution = new P3411MaximumSubarrayWithEqualProducts().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        /**
         * 数学思想：质因数分解的唯一性
         * <p> 任何一个正整数都可以分解为质数的幂次乘积 </p>
         * <p> 存在 (e₁ + e₂ + ... + eₖ) = max(e₁, e₂, ..., eₖ) + min(e₁, e₂, ..., eₖ) </p>
         * @param nums
         * @return
         */
        public int maxLength(int[] nums) {
            int ans = 2;
            int mul = 1;
            int left = 0;
            for (int right = 0; right < nums.length; right++) {
                while (gcd(mul, nums[right]) > 1) {
                    mul /= nums[left];
                    left++;
                }

                mul *= nums[right];
                ans = Math.max(ans, right - left + 1);
            }

            return ans;
        }

        /**
         * 欧几里得算法-辗转相除求最大公约数
         * @param a
         * @param b
         * @return
         */
        private int gcd(int a, int b) {
            while (a != 0) {
                int tmp = a;
                a = b % a;
                b = tmp;
            }

            return b;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)
}