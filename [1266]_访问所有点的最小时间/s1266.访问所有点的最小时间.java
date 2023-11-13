/*
 * @lc app=leetcode.cn id=1266 lang=java
 * @lcpr version=30109
 *
 * [1266] 访问所有点的最小时间
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        //每一步的最短用时加了起来，而每一步的最短用时就是横/纵距离的最大值（路线：先斜着走知道与目标同行或同列，然后再横/竖着走
        int t = 0;
        for(int i = 1; i < points.length; i++){
            t += Math.max(Math.abs(points[i][0] - points[i-1][0]), Math.abs(points[i][1] - points[i-1][1]));
        }
        return t;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1],[3,4],[-1,0]]\n
// @lcpr case=end

// @lcpr case=start
// [[3,2],[-2,2]]\n
// @lcpr case=end

 */

