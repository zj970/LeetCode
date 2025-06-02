package editor.cn;
//给你一个长度为 n 的数组 apple 和另一个长度为 m 的数组 capacity 。 
//
// 一共有 n 个包裹，其中第 i 个包裹中装着 apple[i] 个苹果。同时，还有 m 个箱子，第 i 个箱子的容量为 capacity[i] 个苹果。 
//
//
// 请你选择一些箱子来将这 n 个包裹中的苹果重新分装到箱子中，返回你需要选择的箱子的 最小 数量。 
//
// 注意，同一个包裹中的苹果可以分装到不同的箱子中。 
//
// 
//
// 示例 1： 
//
// 
//输入：apple = [1,3,2], capacity = [4,3,1,5,2]
//输出：2
//解释：使用容量为 4 和 5 的箱子。
//总容量大于或等于苹果的总数，所以可以完成重新分装。
// 
//
// 示例 2： 
//
// 
//输入：apple = [5,5,5], capacity = [2,4,2,7]
//输出：4
//解释：需要使用所有箱子。
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n == apple.length <= 50 
// 1 <= m == capacity.length <= 50 
// 1 <= apple[i], capacity[i] <= 50 
// 输入数据保证可以将包裹中的苹果重新分装到箱子中。 
// 
//
// Related Topics 贪心 数组 排序 👍 17 👎 0


import java.util.Arrays;

/**
 * @author zj970
 * @since 2025-06-02 23:35:43
 */
public class P3074AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        Solution solution = new P3074AppleRedistributionIntoBoxes().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumBoxes(int[] apple, int[] capacity) {
            int sum = 0;
            for (int x: apple) {
                sum += x;
            }
            Arrays.sort(capacity);
            int boxes = 0;
            for (int i = capacity.length - 1; i >= 0; i-- ) {
                if(sum <= 0) {
                    break;
                }

                boxes++;
                sum -= capacity[i];
            }
            return boxes;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}