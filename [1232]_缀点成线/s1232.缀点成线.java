/*
 * @lc app=leetcode.cn id=1232 lang=java
 * @lcpr version=30109
 *
 * [1232] 缀点成线
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for(int i = 2; i < coordinates.length; i++)
        {
            if((coordinates[i][1]-coordinates[i-2][1])*coordinates[i-1][0] - (coordinates[i][1] - coordinates[i-1][1]) * coordinates[i-2][0] != 
                (coordinates[i-1][1] - coordinates[i-2][1])*coordinates[i][0]
                ){
                    return false;
                }
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]\n
// @lcpr case=end

// @lcpr case=start
// [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]\n
// @lcpr case=end

 */

