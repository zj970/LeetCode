package editor.cn;
//给你一个由 非负 整数组成的 m x n 矩阵 grid。 
//
// 在一次操作中，你可以将任意元素 grid[i][j] 的值增加 1。 
//
// 返回使 grid 的所有列 严格递增 所需的 最少 操作次数。 
//
// 
//
// 示例 1： 
//
// 
// 输入: grid = [[3,2],[1,3],[3,4],[0,1]] 
// 
//
// 输出: 15 
//
// 解释: 
//
// 
// 为了让第 0 列严格递增，可以对 grid[1][0] 执行 3 次操作，对 grid[2][0] 执行 2 次操作，对 grid[3][0] 执行 6 
//次操作。 
// 为了让第 1 列严格递增，可以对 grid[3][1] 执行 4 次操作。 
// 
//
//
// 示例 2： 
//
// 
// 输入: grid = [[3,2,1],[2,1,0],[1,2,3]] 
// 
//
// 输出: 12 
//
// 解释: 
//
// 
// 为了让第 0 列严格递增，可以对 grid[1][0] 执行 2 次操作，对 grid[2][0] 执行 4 次操作。 
// 为了让第 1 列严格递增，可以对 grid[1][1] 执行 2 次操作，对 grid[2][1] 执行 2 次操作。 
// 为了让第 2 列严格递增，可以对 grid[1][2] 执行 2 次操作。 
// 
//
//
// 
//
// 提示: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 50 
// 0 <= grid[i][j] < 2500 
// 
//
// Related Topics 贪心 数组 矩阵 👍 4 👎 0


/**
 * @author zj970
 * @since 2025-10-02 22:43:47
 */
public class P3402MinimumOperationsToMakeColumnsStrictlyIncreasing {
    public static void main(String[] args) {
        Solution solution = new P3402MinimumOperationsToMakeColumnsStrictlyIncreasing().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minimumOperations(int[][] grid) {
            int ans = 0;
            for (int j = 0; j < grid[0].length; j++) {
                int pre = -1;
                for (int[] row : grid) {
                    int x = row[j];
                    ans += Math.max(pre + 1 - x, 0);
                    pre = Math.max(pre + 1, x);
                }
            }

            return ans;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}