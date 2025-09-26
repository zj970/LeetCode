package editor.cn;
//给你一个整数数组 nums 和 两个 整数 l 和 r。你的任务是找到一个长度在 l 和 r 之间（包含）且和大于 0 的 子数组 的 最小 和。 
//
// 返回满足条件的子数组的 最小 和。如果不存在这样的子数组，则返回 -1。 
//
// 子数组 是数组中的一个连续 非空 元素序列。 
//
// 
//
// 示例 1： 
//
// 
// 输入： nums = [3, -2, 1, 4], l = 2, r = 3 
// 
//
// 输出： 1 
//
// 解释： 
//
// 长度在 l = 2 和 r = 3 之间且和大于 0 的子数组有： 
//
// 
// [3, -2] 和为 1 
// [1, 4] 和为 5 
// [3, -2, 1] 和为 2 
// [-2, 1, 4] 和为 3 
// 
//
// 其中，子数组 [3, -2] 的和为 1，是所有正和中最小的。因此，答案为 1。 
//
// 示例 2： 
//
// 
// 输入： nums = [-2, 2, -3, 1], l = 2, r = 3 
// 
//
// 输出： -1 
//
// 解释： 
//
// 不存在长度在 l 和 r 之间且和大于 0 的子数组。因此，答案为 -1。 
//
// 示例 3： 
//
// 
// 输入： nums = [1, 2, 3, 4], l = 2, r = 4 
// 
//
// 输出： 3 
//
// 解释： 
//
// 子数组 [1, 2] 的长度为 2，和为 3，是所有正和中最小的。因此，答案为 3。 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 1 <= l <= r <= nums.length 
// -1000 <= nums[i] <= 1000 
// 
//
// Related Topics 数组 前缀和 滑动窗口 👍 13 👎 0


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author zj970
 * @since 2025-09-26 23:50:14
 */
public class P3364MinimumPositiveSumSubarray {
    public static void main(String[] args) {
        Solution solution = new P3364MinimumPositiveSumSubarray().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumSumSubarray(List<Integer> nums, int l, int r) {
            Integer[] a = nums.toArray(Integer[]::new);
            int ans = Integer.MAX_VALUE;
            int n = a.length;
            int[] s = new int[n + 1];
            TreeMap<Integer, Integer> cnt = new TreeMap<>();
            for (int j = 1; j <= n; j++) {
                s[j] = s[j - 1] + a[j - 1];
                if (j < l) {
                    continue;
                }

                cnt.merge(s[j - l], 1, Integer::sum);
                Integer lower = cnt.lowerKey(s[j]);
                if (lower != null) {
                    ans = Math.min(ans, s[j] - lower);
                }

                if (j >= r) {
                    int v = s[j - r];
                    int c = cnt.get(v);
                    if (c == 1) {
                        cnt.remove(v);
                    } else {
                        cnt.put(v, c - 1);
                    }
                }
            }

            return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}