/*
 * @lc app=leetcode.cn id=1725 lang=java
 * @lcpr version=30113
 *
 * [1725] 可以形成最大正方形的矩形数目
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, ans = 0;
        for (int[] r : rectangles) {
            int cur = Math.min(r[0], r[1]);
            if (cur == max) ans++;
            else if (cur > max) {
                max = cur; ans = 1;
            }
        }
        return ans;

    }
}
// @lc code=end



/*
// @lcpr case=start
// [[5,8],[3,9],[5,12],[16,5]]\n
// @lcpr case=end

// @lcpr case=start
// [[2,3],[3,7],[4,3],[3,7]]\n
// @lcpr case=end

 */

