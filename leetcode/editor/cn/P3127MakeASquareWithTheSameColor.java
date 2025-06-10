package editor.cn;
//给你一个二维 3 x 3 的矩阵 grid ，每个格子都是一个字符，要么是 'B' ，要么是 'W' 。字符 'W' 表示白色，字符 'B' 表示黑色。 
//
// 你的任务是改变 至多一个 格子的颜色，使得矩阵中存在一个 2 x 2 颜色完全相同的正方形。
// 
//
// 如果可以得到一个相同颜色的 2 x 2 正方形，那么返回 true ，否则返回 false 。 
//
// 
// 
// 
// 示例 1： 
//
// 
// 
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 输入：grid = [["B","W","B"],["B","W","W"],["B","W","B"]] 
// 
//
// 输出：true 
//
// 解释： 
//
// 修改 grid[0][2] 的颜色，可以满足要求。 
//
// 示例 2： 
//
// 
// 
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 输入：grid = [["B","W","B"],["W","B","W"],["B","W","B"]] 
// 
//
// 输出：false 
//
// 解释： 
//
// 只改变一个格子颜色无法满足要求。 
//
// 示例 3： 
//
// 
// 
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 
// 
//
// 
// 输入：grid = [["B","W","B"],["B","W","W"],["B","W","W"]] 
// 
//
// 输出：true 
//
// 解释： 
//
// grid 已经包含一个 2 x 2 颜色相同的正方形了。
// 
//
// 
//
// 提示： 
//
// 
// grid.length == 3 
// grid[i].length == 3 
// grid[i][j] 要么是 'W' ，要么是 'B' 。 
// 
//
// Related Topics 数组 枚举 矩阵 👍 21 👎 0


/**
 * @author zj970
 * @since 2025-06-10 23:41:34
 */
public class P3127MakeASquareWithTheSameColor {
    public static void main(String[] args) {
        Solution solution = new P3127MakeASquareWithTheSameColor().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canMakeSquare(char[][] grid) {
            int situationA = 'B' + 'B' + 'B' + 'B';
            int situationB = 'W' + 'B' + 'B' + 'B';
            int situationC = 'W' + 'W' + 'W' + 'B';
            int situationD = 'W' + 'W' + 'W' + 'W';
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                   int temp = grid[i][j] + grid[i][j+1] + grid[i+1][j] + grid[i+1][j+1];
                   if (temp == situationA || temp == situationB || temp == situationC || temp == situationD){
                       return true;
                   }
                }
            }

            return false;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}