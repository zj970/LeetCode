/*
 * @lc app=leetcode.cn id=1893 lang=java
 * @lcpr version=30117
 *
 * [1893] 检查是否区域内所有整数都被覆盖
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Arrays.sort(ranges, (a1, a2) -> a1[0] - a2[0]);
        for(int[] range: ranges) {
            int l = range[0];
            int r = range[1];
            if(l <= left && left <= r) {
                left = r + 1;
            }
        }
        return left > right;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[3,4],[5,6]]\n2\n5\n
// @lcpr case=end

// @lcpr case=start
// [[1,10],[10,20]]\n21\n21\n
// @lcpr case=end

 */

