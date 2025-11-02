package editor.cn;
//给你一个整数数组 nums。 
//
// 如果数组中任一元素的 频次 是 质数，返回 true；否则，返回 false。 
//
// 元素 x 的 频次 是它在数组中出现的次数。 
//
// 质数是一个大于 1 的自然数，并且只有两个因数：1 和它本身。 
//
// 
//
// 示例 1： 
//
// 
// 输入： nums = [1,2,3,4,5,4] 
// 
//
// 输出： true 
//
// 解释： 
//
// 数字 4 的频次是 2，而 2 是质数。 
//
// 示例 2： 
//
// 
// 输入： nums = [1,2,3,4,5] 
// 
//
// 输出： false 
//
// 解释： 
//
// 所有元素的频次都是 1。 
//
// 示例 3： 
//
// 
// 输入： nums = [2,2,2,4,4] 
// 
//
// 输出： true 
//
// 解释： 
//
// 数字 2 和 4 的频次都是质数。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 100 
// 
//
// Related Topics 数组 哈希表 数学 计数 数论 👍 3 👎 0


/**
 * @author zj970
 * @since 2025-11-02 23:32:46
 */
public class P3591CheckIfAnyElementHasPrimeFrequency {
    public static void main(String[] args) {
        Solution solution = new P3591CheckIfAnyElementHasPrimeFrequency().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkPrimeFrequency(int[] nums) {
            int[] maps = new int[101];
            for (int i = 0; i < nums.length; i++) {
                maps[nums[i]]++;
            }

            for (int i = 0; i < maps.length; i++) {
                if (maps[i] == 0) {
                    continue;
                }

                if (isPrime(maps[i])) {
                    return true;
                }
            }

            return false;
        }

        private boolean isPrime(int op) {
            switch (op) {
                case 2:
                case 3:
                case 5:
                case 7:
                case 11:
                case 13:
                case 17:
                case 19:
                case 23:
                case 29:
                case 31:
                case 37:
                case 41:
                case 43:
                case 47:
                case 53:
                case 59:
                case 61:
                case 67:
                case 71:
                case 73:
                case 79:
                case 83:
                case 89:
                case 97:
                    return true;
                default:
                    return false;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}