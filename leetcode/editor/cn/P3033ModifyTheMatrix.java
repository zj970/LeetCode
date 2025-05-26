package editor.cn;
//给你一个下标从 0 开始、大小为 m x n 的整数矩阵 matrix ，新建一个下标从 0 开始、名为 answer 的矩阵。使 answer 与 
//matrix 相等，接着将其中每个值为 -1 的元素替换为所在列的 最大 元素。 
//
// 返回矩阵 answer 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：matrix = [[1,2,-1],[4,-1,6],[7,8,9]]
//输出：[[1,2,9],[4,8,6],[7,8,9]]
//解释：上图显示了发生替换的元素（蓝色区域）。
//- 将单元格 [1][1] 中的值替换为列 1 中的最大值 8 。
//- 将单元格 [0][2] 中的值替换为列 2 中的最大值 9 。
// 
//
// 示例 2： 
// 
// 
//输入：matrix = [[3,-1],[5,2]]
//输出：[[3,2],[5,2]]
//解释：上图显示了发生替换的元素（蓝色区域）。
// 
//
// 
//
// 提示： 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 2 <= m, n <= 50 
// -1 <= matrix[i][j] <= 100 
// 测试用例中生成的输入满足每列至少包含一个非负整数。 
// 
//
// Related Topics 数组 矩阵 👍 27 👎 0


/**
 * @author zj970
 * @since 2025-05-26 22:31:26
 */
public class P3033ModifyTheMatrix {
    public static void main(String[] args) {
        Solution solution = new P3033ModifyTheMatrix().new Solution();
    }


    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[][] modifiedMatrix(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] res = new int[m][n];
            for (int j = 0; j < n; j++) {
                // 找出每一列最大值
                int colMax = res[0][j];
                for (int i = 0; i < m; i++) {
                    res[i][j] = matrix[i][j];
                    colMax = Math.max(colMax, res[i][j]);
                }

                // 将每一列的 -1 更新为最大值
                for (int i = 0; i < m; i++) {
                    if (res[i][j] == -1) {
                        res[i][j] = colMax;
                    }
                }
            }

            return res;
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}