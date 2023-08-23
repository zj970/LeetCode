/*
 * @lc app=leetcode.cn id=883 lang=java
 *
 * [883] 三维形体投影面积
 */

// @lc code=start
class Solution {
    /**
     * 根据题意
     * x轴对应行，y轴对应列，z轴队列网格的数值
     * 
     * xy平面的投影面积等于网格上非零值的数值
     * yz平面的投影面积等于网格上每一行最大值之和
     * zx平面的投影面积等于网格上每一列最大值之和
     */
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int xyArea = 0, yzArea = 0, zxArea = 0;
        for(int i = 0; i < n; i++)
        {
            int yzHeight = 0, zxHeight = 0;
            for(int j = 0; j < n; j++)
            {
                xyArea += grid[i][j] > 0 ? 1 : 0;
                yzHeight = Math.max(yzHeight, grid[j][i]);
                zxHeight = Math.max(zxHeight, grid[i][j]);
            }
            yzArea += yzHeight;
            zxArea += zxHeight;
        }

        return xyArea+yzArea+zxArea;

    }
}
// @lc code=end

