/*
 * @lc app=leetcode.cn id=1351 lang=java
 * @lcpr version=30110
 *
 * [1351] 统计有序矩阵中的负数
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        int length = grid[0].length;
        for(int[] arrs : grid){
            for(int i = 0; i < arrs.length;i++){
                if(arrs[i] < 0){
                    sum += length - i;
                    break;
                }
            }
        }

        return sum;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]\n
// @lcpr case=end

// @lcpr case=start
// [[3,2],[1,0]]\n
// @lcpr case=end

 */

