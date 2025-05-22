package editor.cn;
//给你一个由 正整数 组成的数组 nums 。 
//
// 返回数组 nums 中所有具有 最大 频率的元素的 总频率 。 
//
// 元素的 频率 是指该元素在数组中出现的次数。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,3,1,4]
//输出：4
//解释：元素 1 和 2 的频率为 2 ，是数组中的最大频率。
//因此具有最大频率的元素在数组中的数量是 4 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,2,3,4,5]
//输出：5
//解释：数组中的所有元素的频率都为 1 ，是最大频率。
//因此具有最大频率的元素在数组中的数量是 5 。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 100 
// 1 <= nums[i] <= 100 
// 
//
// Related Topics 数组 哈希表 计数 👍 8 👎 0


import java.util.HashMap;
import java.util.Map;

/**
 * @author zj970
 * @since 2025-05-22 23:44:44
 */
public class P3005CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        Solution solution = new P3005CountElementsWithMaximumFrequency().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxFrequencyElements(int[] nums) {
            int ans = 0, maxCont = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                int c = map.merge(num, 1, Integer::sum);
                if (c > maxCont) {
                    maxCont = ans = c;
                } else if (c == maxCont) {
                    ans += c;
                }
            }

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}