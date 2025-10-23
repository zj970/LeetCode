package editor.cn;
//给你一个数组 nums，你可以执行以下操作任意次数： 
//
// 
// 选择 相邻 元素对中 和最小 的一对。如果存在多个这样的对，选择最左边的一个。 
// 用它们的和替换这对元素。 
// 
//
// 返回将数组变为 非递减 所需的 最小操作次数 。 
//
// 如果一个数组中每个元素都大于或等于它前一个元素（如果存在的话），则称该数组为非递减。 
//
// 
//
// 示例 1： 
//
// 
// 输入： nums = [5,2,3,1] 
// 
//
// 输出： 2 
//
// 解释： 
//
// 
// 元素对 (3,1) 的和最小，为 4。替换后 nums = [5,2,4]。 
// 元素对 (2,4) 的和为 6。替换后 nums = [5,6]。 
// 
//
// 数组 nums 在两次操作后变为非递减。 
//
// 示例 2： 
//
// 
// 输入： nums = [1,2,2] 
// 
//
// 输出： 0 
//
// 解释： 
//
// 数组 nums 已经是非递减的。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 50 
// -1000 <= nums[i] <= 1000 
// 
//
// Related Topics 数组 哈希表 链表 双向链表 有序集合 模拟 堆（优先队列） 👍 5 👎 0


/**
 * @author zj970
 * @since 2025-10-23 23:26:57
 */
public class P3507MinimumPairRemovalToSortArrayI {
    public static void main(String[] args) {
        Solution solution = new P3507MinimumPairRemovalToSortArrayI().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumPairRemoval(int[] nums) {
            int removals = 0;
            int n = nums.length;
            while (!isNonDecreasing(nums, n)) {
                update(nums, n);
                removals++;
                n--;
            }
            return removals;
        }

        public void update(int[] nums, int n) {
            int minSum = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] + nums[i + 1] < minSum) {
                    minSum = nums[i] + nums[i + 1];
                    index = i;
                }
            }
            if (index >= 0) {
                nums[index] = minSum;
                for (int i = index + 1; i < n - 1; i++) {
                    nums[i] = nums[i + 1];
                }
            }
        }

        public boolean isNonDecreasing(int[] nums, int n) {
            for (int i = 1; i < n; i++) {
                if (nums[i - 1] > nums[i]) {
                    return false;
                }
            }
            return true;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}