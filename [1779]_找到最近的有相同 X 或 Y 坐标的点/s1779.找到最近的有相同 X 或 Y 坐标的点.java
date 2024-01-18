/*
 * @lc app=leetcode.cn id=1779 lang=java
 * @lcpr version=30113
 *
 * [1779] 找到最近的有相同 X 或 Y 坐标的点
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1;
        // 1.找有效点
        // 2.求解曼哈顿距离
        // 3.记录当前的下标，最短的交换下标
        // 记录 曼哈顿距离
        int man = Integer.MAX_VALUE;
        for(int i = 0; i < points.length; i++){
            if (points[i][0] == x || points[i][1] == y) {
                //有效点曼哈顿距离
                int temp = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if (temp < man) {
                    man = temp;
                    //记录当前的下标
                    index = i;
                }
            }
        }
        return index;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n4\n[[1,2],[3,1],[2,4],[2,3],[4,4]]\n
// @lcpr case=end

// @lcpr case=start
// 3\n4\n[[3,4]]\n
// @lcpr case=end

// @lcpr case=start
// 3\n4\n[[2,3]]\n
// @lcpr case=end

 */

