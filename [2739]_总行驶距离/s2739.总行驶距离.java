/*
 * @lc app=leetcode.cn id=2739 lang=java
 * @lcpr version=30204
 *
 * [2739] 总行驶距离
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int distance = 0;
        while (mainTank > 0) {
            if (mainTank >= 5) {
                mainTank -= 5;
                distance += 5 * 10;
                if (additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
            } else {
                distance += mainTank * 10;
                mainTank = 0;
            }
        }

        return distance;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n10\n
// @lcpr case=end

// @lcpr case=start
// 1\n2\n
// @lcpr case=end

 */

