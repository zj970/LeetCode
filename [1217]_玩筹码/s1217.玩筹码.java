/*
 * @lc app=leetcode.cn id=1217 lang=java
 * @lcpr version=30109
 *
 * [1217] 玩筹码
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
        for (int pos : position) {
            if ((pos & 1) != 0) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.min(odd, even);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2,3,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,1000000000]\n
// @lcpr case=end

 */

